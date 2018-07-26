package cap5;

import java.util.ArrayList;

public class Articles {

    private ArrayList<Article> list;

    public Articles(){
        list = new ArrayList<Article>();
    }

    public ArrayList<Article> getList()
    {
        return list;
    }

    public void add(Article article)
    {
        list.add(article);
    }
}
