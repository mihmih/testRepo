package testPack.testPack.testPack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class JavaDocClass
{
    private String str1;
    private Map<Boolean, ArrayList<String>> map;

    /**
     * This method generally does nothing :)
     * 
     * @return strign
     * @throws IOException IF sth is corrupted
     */
    public String getStr1() throws IOException

    {
        return str1;
    }

    /**
     * re t aewtgcaet4c5watg vc
     * 
     * @param str1 some useless Str
     */
    public void setStr1(String str1)
    {
        this.str1 = str1;
    }

    public Map<Boolean, ArrayList<String>> getMap()
    {
        return map;
    }

    /**
     * qwertttttt
     * 
     * @param map asdf
     */

    public void setMap(Map<Boolean, ArrayList<String>> map)
    {
        this.map = map;
    }

}
