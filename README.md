# multiline-collapsingtoolbar
_multiline-collapsingtoolbar_ is a replacement for `CollapsingToolbarLayout` from the [Android Design Support Library](https://github.com/android/platform_frameworks_support/tree/master/design) which can deal with multiline titles (currently hard-coded to a maximum of 3 lines) in the expanded state. When collapsing the toolbar, the lower lines of the title fade away to leave only the top line visible.

## Example
Here you can see the library in use in the [Web Opac App](https://github.com/opacapp/opacclient):

![Demo image](https://drop.rami.io/0DyEN/)

Background Image credit: [_Tom Murphy VII_ on Wikimedia Commons, CC-BY-SA 3.0](https://commons.wikimedia.org/wiki/File:Old_book_bindings.jpg)

## Usage
The library's public API is identical to the version from the support library, so you can use it as a drop-in replacement.

XML layout example:
```xml
<android.support.design.widget.AppBarLayout
        android:layout_height="192dp"
        android:layout_width="match_parent">
    <net.opacapp.multilinecollapsingtoolbar.CollapsingToolbarLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:layout_scrollFlags="scroll|exitUntilCollapsed">
        <android.support.v7.widget.Toolbar
                android:layout_height="?attr/actionBarSize"
                android:layout_width="match_parent"
                app:layout_collapseMode="pin"/>
    </net.opacapp.multilinecollapsingtoolbar.CollapsingToolbarLayout>
</android.support.design.widget.AppBarLayout>
```

## Implementation details
Most of the code is copied from the original Support Library classes, the only changes (apart from the package name, imports and automatic code reformatting) are in the `CollapsingTextHelper` class. The changes there are marked with comments.

The current version 1.0.0 of the library is based on the code from the Design Support Library version 23.1.1.
