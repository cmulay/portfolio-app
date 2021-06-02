package com.mad.portfolio.sidemenu;

import com.mad.portfolio.R;

import java.util.ArrayList;
import java.util.List;

public class MenuUtil {

    public static final int HOME_FRAGMENT_CODE = 0;
    public static final int EDUCATION_FRAGMENT_CODE = 1;
    public static final int WORK_FRAGMENT_CODE = 2;
    public static final int TESTIMONIAL_FRAGMENT_CODE = 3;
    public static final int CONTACT_FRAGMENT_CODE = 4;


    public static List<MenuItem> getMenuList() {

        List<MenuItem> list = new ArrayList<>();
        list.add(new MenuItem(R.drawable.ic_home, HOME_FRAGMENT_CODE, true));
        list.add(new MenuItem(R.drawable.ic_education, EDUCATION_FRAGMENT_CODE, false));
        list.add(new MenuItem(R.drawable.ic_work, WORK_FRAGMENT_CODE, false));
        list.add(new MenuItem(R.drawable.ic_groups, TESTIMONIAL_FRAGMENT_CODE, false));
        list.add(new MenuItem(R.drawable.ic_connect, CONTACT_FRAGMENT_CODE, false));

        return list;
    }
}

