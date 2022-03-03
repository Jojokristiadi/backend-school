# Endpoint
Contoh endpoint:
- api.tokopedia.com/sellers
- api.tokopedia.com/accounts
- api.tokopedia.com/products

## Ketentuan:
- Berupa kata benda plural (lebih dari 1)
- Dapat diikuti id (/sellers/1)
- Bisa nested (/stores/1/products)

# JSON
Contoh json:
```json
[
    {
        "id": "123",
        "name": "Bando",
        "price": 10000
        "couriers": [
            {
                "name": "Sicepat",
                "service": {
                    "type": "sameday",
                    "cost": 10000
                }
            },
            {
                "name": "Sicepat",
                "service": {
                    "type": "reg",
                    "cost": 5000
                }
            },
            {
                "name": "JNE",
                "service": {
                    "type": "reg",
                    "cost": 9000
                }
            }
        ]
    },
    {
        "id": "456",
        "name": "Karet Jepang",
        "price": 7000
        "couriers": [
            {
                "name": "AnterAja",
                "service": {
                    "type": "sameday",
                    "cost": 10000
                }
            },
            {
                "name": "AnterAja",
                "service": {
                    "type": "reg",
                    "cost": 5000
                }
            },
            {
                "name": "JNE",
                "service": {
                    "type": "reg",
                    "cost": 9000
                }
            }
        ]
    }
]
```

## Ketentuan:
- Array dilambangkan []
- Object dilambangkan {}
- Cara penulisan "key": "value"
- Bisa string atau integer, kalau string pakai petik

# HTTP Method
- GET: mengambil data
- POST: membuat data baru
    * Untuk post, kita perlu menambahkan body
    * Body yang dikirim adalah JSON dari object yang mau ditambahkan
    * Tidak perlu menulis id nya
    * Post akan mengembalikan object yang telah terbuat beserta id nya
    * Tipe data post body adalah raw > JSON
- PUT: mengedit data keseluruhan
    * Untuk put perlu menuliskan id mana yang mau diubah (/products/1)
    * Perlu menulis bodynya sesuai dengan yang mau diedit
    * Body berupa JSON dan harus lengkap (tapi tidak perlu id)
    * Akan mengembalikan object yang sudah diedit
- PATCH: mengedit data sebagian
    * Mirip dengan put, tapi hanya perlu mengirim bagian yang akan diubah
- DELETE: untuk menghapus data
    * Untuk delete perlu menuliskan id mana yang mau dihapus (/products/1)

# HTTP Status
- Depannya 1 (1xx, contoh 100, 101, dst): informasi
- Depannya 2 (2xx, contoh 200, 201, dst): sukses
- Depannya 3 (3xx, contoh 300, 301, dst): redirect
- Depannya 4 (4xx, contoh 400, 401, dst): kesalahan dari user, misal salah url, salah password, belum login
- Depannya 5 (5xx, contoh 500, 501, dst): kesalahan dari server, misal server down

## HTTP Status yang sering dipakai
- 200 OK
- 404 Not found
- 201 Created
- 403 Unauthorized (belum login)
- 400 Bad Request (salah input)
- 500 Server error

## Springboot
- Untuk memulai bisa buat project dari: https://start.spring.io/ pilih dependency:
    * Spring web
    * Spring data JPA
    * Lombok
    * H2 Database
- Ada 4 bagian besar dari backend: 
    * Models
    
        Membuat object class berdasarkan table yang ada. Tapi tidak harus selalu dari table.
    * Controllers
    
        Tempat kita membuat endpointnya dan mendaftarkan ada HTTP method apa saja. Misal ada /users lalu bisa di GET, POST, PUT. 
    * Services
    
        Kita bisa menaruh logika di sini misalnya saat hendak menambahkan user baru dengan password, kita bisa melakukan enkripsi password di sini. Di sini kita juga bisa melakukan dekripsi password dan sebagainya.
    * Repositories
      
        Untuk menghubungkan dengan database
