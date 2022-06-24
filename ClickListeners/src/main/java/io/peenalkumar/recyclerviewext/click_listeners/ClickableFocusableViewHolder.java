package io.peenalkumar.recyclerviewext.click_listeners;

import android.view.View;

import androidx.annotation.Nullable;
// TODO: 24-06-2022 Peenalkumar
public class ClickableFocusableViewHolder extends ClickableViewHolder {
    public ClickableFocusableViewHolder(View itemView, @Nullable OnItemClickListener onItemClickListener) {
        this(itemView, onItemClickListener, null);
    }

    public ClickableFocusableViewHolder(View itemView, @Nullable OnItemClickListener onItemClickListener,
                                        @Nullable OnItemLongClickListener onItemLongClickListener) {
        super(itemView, onItemClickListener, onItemLongClickListener);

        itemView.setFocusable(onItemClickListener != null || onItemLongClickListener != null);
    }
}
