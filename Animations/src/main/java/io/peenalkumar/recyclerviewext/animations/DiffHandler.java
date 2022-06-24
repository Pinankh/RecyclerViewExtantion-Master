package io.peenalkumar.recyclerviewext.animations;
// TODO: 24-06-2022 Peenalkumar
/**
 * Interface definition for a diff handler.
 */
interface DiffHandler {
    void onItemRangeChanged(int positionStart, int itemCount);

    void onItemRangeInserted(int positionStart, int itemCount);

    void onItemRangeRemoved(int positionStart, int itemCount);

    void onItemMoved(int fromPosition, int toPosition);
}
