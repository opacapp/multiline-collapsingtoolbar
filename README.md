# multiline-collapsingtoolbar [ ![Download](https://api.bintray.com/packages/opacapp/libs/multiline-collapsingtoolbar/images/download.svg) ](https://bintray.com/opacapp/libs/multiline-collapsingtoolbar/_latestVersion)
_multiline-collapsingtoolbar_ is a replacement for `CollapsingToolbarLayout` from the [Android Design Support Library](https://github.com/android/platform_frameworks_support/tree/master/design) which can deal with multiline titles (currently hard-coded to a maximum of 3 lines) in the expanded state. When collapsing the toolbar, the lower lines of the title fade away to leave only the top line visible.

## Example
Here you can see the library in use in the [Web Opac App](https://github.com/opacapp/opacclient):

![Demo image](https://drop.rami.io/0DyEN/)

Background Image credit: [_Tom Murphy VII_ on Wikimedia Commons, CC-BY-SA 3.0](https://commons.wikimedia.org/wiki/File:Old_book_bindings.jpg)

## Installation

If you are using Gradle and the JCenter Maven Repository, installing the library is as simple as
adding a new dependency statement.

```gradle
dependencies {
    compile 'net.opacapp:multiline-collapsingtoolbar:1.2.0'
}
```

## Usage
The library's public API is nearly identical to the version from the support library, so you can use it as a drop-in replacement. We only added a `maxLines` attribute and corresponding getter and setter functions to the `CollapsingToolbarLayout` to make it possible to change the maximum number of lines, which is set to 3 by default.

As the Design Support Library, it should be compatible with API 7 (Android 2.1) and above.

XML layout example:
```xml
<android.support.design.widget.AppBarLayout
        android:layout_height="192dp"
        android:layout_width="match_parent">
    <net.opacapp.multilinecollapsingtoolbar.CollapsingToolbarLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:layout_scrollFlags="scroll|exitUntilCollapsed"
            app:maxLines="3">
        <android.support.v7.widget.Toolbar
                android:layout_height="?attr/actionBarSize"
                android:layout_width="match_parent"
                app:layout_collapseMode="pin"/>
    </net.opacapp.multilinecollapsingtoolbar.CollapsingToolbarLayout>
</android.support.design.widget.AppBarLayout>
```

You can find a simple demo application in the `demo` module.

## Implementation details
Most of the code is copied from the original Support Library classes, the only changes (apart from the package name, imports and automatic code reformatting) are in the `CollapsingTextHelper` and `CollapsingToolbarLayout` classes. The changes there are marked with comments.

The current version 1.2.0 of the library is based on the code from the Design Support Library version 24.0.0.

## Contributing

This library is probably not complete and might contain bugs that only occur in constellations we did not
yet test. Please do not hesitate to create an issue on GitHub for any problems that cross your way. Please
understand that we cannot afford to spend time fixing problems that do not affect our products, but we'll
be happy to merge pull requests if you or someone else is able to improve this library.

If you get stuck anywhere in the process, please do not hestitate to ask us anytime at info@opacapp.de.

Please note that we have a [Code of Conduct](https://github.com/opacapp/multiline-collapsingtoolbar/blob/master/CODE_OF_CONDUCT.md)
in place that applies to all project-related communication.
