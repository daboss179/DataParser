import java.io.File;
import java.io.IOException;
import java.util.*;

public class Utills {

    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public static ArrayList<ElectionResult> parse2016ElectionResults(String data){
        ArrayList<ElectionResult> list = new ArrayList<ElectionResult>();
        String[] a = data.split("/n");
        for(String s : a){
            ElectionResult currResult = new ElectionResult();
            String s2 = StringCleaner(s);



                String[] categorys = s.split(",");

                currResult.setVotes_dem(Double.parseDouble(categorys[1]));

                currResult.setVotes_gop(Double.parseDouble(categorys[2]));

                currResult.setTotal_votes(Double.parseDouble(categorys[3]));

                currResult.setPer_dem(Double.parseDouble(categorys[4]));
                currResult.setPer_gop(Double.parseDouble(categorys[5]));
                String tempStrings = "";
                for(int j = 0; categorys[6].charAt(j) != '%'; i++){
                    char c3 = categorys[6].charAt(j);
                    if(c3 != '%'){
                        tempStrings += c3;
                    }
                }
                currResult.setPer_point_dif(Double.parseDouble(tempStrings));

                currResult.setState_abbr(categorys[7]);

                currResult.setCounty_name(categorys[8]);

                currResult.setCombined_flips(Integer.parseInt(categorys[9]));




            list.add(currResult);

        }
        return list;
    }

    public String removeCommas(String string){
        String temp = "36,296";
        int indexOfComma = -1;
        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            if (c == ',') indexOfComma = i;
        }

        String result = temp.substring(0, indexOfComma) + temp.substring(indexOfComma + 1);

        return result;
    }
}



public static String StringCleaner(String s){
    String tempString="";
        for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='"'){
        for(int j=i+1;s.charAt(j)!='"';i++){
        char c2=s.charAt(j);
        if(c2!=','){
        tempString+=c2;
            }
                 }
                }
                if(c!= '%'){
        tempString+=c;
        }
            }
            return tempString;
        }
}