# Logic Test and Query Test

## 1. Logic Test

### Deskripsi

Terdapat sebuah array of strings sebagai berikut:
```
['cook', 'save', 'taste', 'aves', 'vase', 'state', 'map']
```
Buatlah sebuah fungsi yang mengelompokkan sebuah array of strings di atas menjadi kumpulan anagram, dengan expected result sebagai berikut:

```[
  [ 'cook' ],
  [ 'save', 'aves', 'vase' ],
  [ 'taste', 'state' ],
  [ 'map' ]
]
```
Catatan: dilarang menggunakan built in function seperti array.map, array.reduce, dan array.filter.



## 2.Query Test 
### Deskripsi
Terdapat tabel sebagai berikut:
```
id	name	parent_id
1	Zaki	2
2	Ilham	NULL
3	Irwan	2
4	Arka	3
```
Buatlah query SQL yang menghasilkan data sebagai berikut:
```
id	name  parent_name
1	Zaki	Ilham
2	Ilham	NULL
3	Irwan	Ilham
4	Arka	Irwan
```