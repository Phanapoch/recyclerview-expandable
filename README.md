ExpandableLayoutRecyclerView
============================

RecyclerView implementation of [traex's ExpandableLayout](https://github.com/traex/ExpandableLayout).


Download
--------

```gradle
compile 'io.github.hendraanggrian:expandablelayoutrecyclerview:0.0.3'
```


Usage
-----

Create a class extending ExpandableLayoutRecyclerView.Adapter:

```java
public class TestAdapter extends ExpandableLayoutRecyclerView.Adapter<TestAdapter.ViewHolder> {

    public TestAdapter(LinearLayoutManager lm) {
        super(lm);
        ...
    }

    @Override
    public void onBindViewHolder(TestAdapter.ViewHolder holder, final int position) {
        super.onBindViewHolder(holder, position);
        ...
    }
    
    ...

    public static class ViewHolder extends ExpandableLayoutRecyclerView.ViewHolder {
        public ExpandableLayoutItem expandableLayoutItem;
    
        public ViewHolder(View itemView) {
            super(itemView);
            expandableLayoutItem = (ExpandableLayoutItem) itemView.findViewById(R.id.row);
        }
    
        @Override
        public ExpandableLayoutItem getExpandableLayoutItem() {
            return expandableLayoutItem;
        }
    }
}
```

Then pass LinearLayoutManager to the adapter:

```java
TestAdapter adapter = new TestAdapter(new LinearLayoutManager(this));

ExpandableLayoutRecyclerView elRecyclerView = (ExpandableLayoutRecyclerView) findViewById(R.id.recyclerView);
elRecyclerView.setAdapter(adapter);
elRecyclerView.setLayoutManager(adapter.getLayoutManager());
```


License
--------

    The MIT License (MIT)

    Copyright (c) 2015 Hendra Anggrianto Wijaya

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.