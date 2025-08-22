package br.com.local.bikeontabapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterTabItens extends FragmentStateAdapter {
    public AdapterTabItens(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new BikesFragment();
            case 1:
                return new EquipamentosFragment();
            case 2:
                return new LojaFragment();
            default:
                return new BikesFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
