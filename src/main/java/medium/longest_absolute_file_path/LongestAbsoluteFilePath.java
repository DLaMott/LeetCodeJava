package medium.longest_absolute_file_path;

import java.util.*;

public class LongestAbsoluteFilePath {


    String name;
    List<LongestAbsoluteFilePath> children;
    LongestAbsoluteFilePath parent;

    public LongestAbsoluteFilePath(String name, LongestAbsoluteFilePath parent){
        this.name = name;
        this.children = new ArrayList<>();
        this.parent = parent;
    }


    public static class DirectoryStructure {

        public static LongestAbsoluteFilePath buildStructure(String input) {

            String[] lines = input.split("\n");

            LongestAbsoluteFilePath root = new LongestAbsoluteFilePath("", null);
            LongestAbsoluteFilePath current = root;

            int currentLevel = 0;

            for (String line : lines) {

                int level = line.lastIndexOf("\t" + 1);
                String directoryName = line.trim();

                while (level <= currentLevel && current != root) {
                    current = current.parent;
                    currentLevel--;
                }

                LongestAbsoluteFilePath longestAbsoluteFilePath = new LongestAbsoluteFilePath(directoryName, current);
                longestAbsoluteFilePath.children.add(longestAbsoluteFilePath);
                current = longestAbsoluteFilePath;
                currentLevel = level;

            }

            return root;

        }

    }







    public int getLongestPath(String input){


        if(!input.contains("dir") && input.contains(".")){

            List<String> s = Arrays.stream(input.split("\n")).toList();

            return s.stream().max(Comparator.comparingInt(String::length)).get().length();
        }


        String[] paths = input.split("\n");

        int maxLength = 0;

        Map<Integer, Integer> fileLengths = new HashMap<>();

        for(String string: paths){



            String valWithoutTabs = string.replaceAll("\t", "");
            int fileDepth = string.length() - valWithoutTabs.length();

            if (valWithoutTabs.contains(".")) {
                maxLength = Math.max(maxLength, fileLengths.get(fileDepth) + valWithoutTabs.length());
            } else {
                fileLengths.put(fileDepth + 1, fileLengths.getOrDefault(fileDepth, 0) + valWithoutTabs.length() + 1); // 1 for the '/'
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        LongestAbsoluteFilePath l =  DirectoryStructure.buildStructure("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext");

        System.out.println(l);
    }

}
