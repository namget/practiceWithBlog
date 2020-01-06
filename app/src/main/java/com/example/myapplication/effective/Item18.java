package com.example.myapplication.effective;

public class Item18 {

//    public class InstrumentedHashSet<E> extends HashSet<E>{
//        private int addCount = 0;
//
//        public InstrumentedHashSet() {
//        }
//
//        public InstrumentedHashSet(int initialCapacity, float loadFactor) {
//            super(initialCapacity, loadFactor);
//        }
//
//        @Override
//        public boolean add(E e) {
//            addCount++;
//            return super.add(e);
//        }
//
//        @Override
//        public boolean addAll(@NonNull Collection<? extends E> c) {
//            addCount += c.size();
//            return super.addAll(c);
//        }
//
//        public int getAddCount() {
//            return addCount;
//        }
//    }


/*
    public void main(){
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(Arrays.asList("1","22","333"));

    }

    public class InstrumentedHashSet<E> extends ForwardingSet<E>{
        private int addCount = 0;

        public InstrumentedHashSet() {
        }

        public InstrumentedHashSet(int initialCapacity, float loadFactor) {
            super(initialCapacity, loadFactor);
        }

        @Override
        public boolean add(E e) {
            addCount++;
            return super.add(e);
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends E> c) {
            addCount += c.size();
            return super.addAll(c);
        }

        public int getAddCount() {
            return addCount;
        }
    }

    public class ForwardingSet<E> implements Set<E>{
        private Set<E> s;

        public ForwardingSet(Set<E> s) {
            this.s = s;
        }

        @Override
        public void clear() {
            s.clear();
        }

        //......
    }
*/



}
