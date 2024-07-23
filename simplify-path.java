class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        for (String component : components) {
            if (component.isEmpty() || component.equals(".")) {
                // Ignore empty components and single periods
                continue;
            } else if (component.equals("..")) {
                // Pop from stack if there's a directory to go up to
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Push valid directory names onto the stack
                stack.push(component);
            }
        }

        // Build the canonical path
        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.append("/").append(dir);
        }

        // Ensure the path starts with a single slash
        return simplifiedPath.length() > 0 ? simplifiedPath.toString() : "/";
    }
}