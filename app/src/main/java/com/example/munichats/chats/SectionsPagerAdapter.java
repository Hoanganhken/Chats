package com.example.munichats.chats;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by AkshayeJH on 11/06/17.
 */

class SectionsPagerAdapter extends FragmentPagerAdapter {


    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch(position) {
            case 0:
                FriendsFragment friendsFragment = new FriendsFragment();
                return friendsFragment;

            case 1:
                ChatsFragment chatsFragment = new ChatsFragment();
                return  chatsFragment;

            case 2:

            RequestsFragment requestsFragment = new RequestsFragment();
            return requestsFragment;
            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){

        switch (position) {
            case 0:
                return "Tin Nhắn";

            case 1:
                return "Nhóm";

            case 2:
                return "Online";

            default:
                return null;
        }

    }

}
