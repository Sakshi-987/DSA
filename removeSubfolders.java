import java.util.*;

public class removeSubfolders {

    public static List<String> newFolder(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        ans.add(folder[0]);
        for (int i = 1; i < folder.length; i++) {
            String prevFolder = ans.get(ans.size() - 1);
            prevFolder += '/';
            if (!folder[i].startsWith(prevFolder))
                ans.add(folder[i]);
        }
        return ans;
    }

    public static void main(String args[]) {
        String[] folder = { "/a", "/a/b", "/c/d", "/c/d/e", "/c/f" };
        System.out.println(newFolder(folder));
    }
}
