Collection集合总结（掌握）
	Collection	
		|--List有序，可重复
			|--ArrayList
				底层数据结构是数组，查询快，增删慢。
				线程不安全，效率高
			|--Vector
				底层数据结构是数组，查询快，增删慢。
				线程安全，效率低
			|--LinkedList
				底层数据结构是链表，查询慢，增删快。
				线程不安全，效率高
		|--Set 无序，唯一
			|--HashSet
				底层数据结构是哈希表。
				如何保证元素唯一性呢？
					依赖两个方法：hashCode()和equals()
					开发中自动生成这两个方法即可
				|--LinkedHashSet
					底层数据结构是链表和哈希表
					由链表保证元素有序
					由哈希表保证元素唯一
			|--TreeSet
				底层数据结构是红黑树
				如何保证元素排序？
					自然排序
					比较器排序
				如何保证元素唯一性？
					根据比较的返回值是否为0来决定

针对Collection集合我们到底使用谁呢？
	唯一吗？
		是：set
			排序吗？
				是：TreeSet
				否：HashSet
		如果你知道是Set但是不知道是哪个Set，就用HashSet
	
		否：List
			要安全吗？
				是：Vector
				否：ArrayList或者LinkedList
					查询多：ArrayList
					增删多：LinkedList
		如果你知道是List，但是不知道是哪个List，就用ArrayList
		
	如果你知道是Collection集合，但是不知道使用谁，就用ArrayList。
	
	如果你知道用集合，就用ArrayList。
	
集合中常见的数据结构
	ArrayXxx：底层数据结构是数组，查询快，增删慢
	LinkedXxx:底层数据结构是链表，查询慢，增删快
	HashXxx:底层数据结构是哈希表。依赖两个方法：hashCode()和equals()
	TreeXxx:底层数据结构是二叉树（红黑树）。两种方式排序：自然排序和比较器排序