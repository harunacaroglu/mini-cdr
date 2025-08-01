## Mini CDR (Call Detail Record) İşleme ve Raporlama Sistemi

Java + Spring Boot + MySQL + Docker kullanılarak geliştirilmiş REST API projesi.

## API Uç Noktaları

- `POST /api/cdrs` – Tek kayıt ekler
- `POST /api/cdrs/bulk` – Toplu kayıt ekler
- `GET /api/cdrs` – Tüm kayıtları listeler
- `GET /api/cdrs/by-caller/{aNumber}` – Arayan numaraya göre filtre
- `GET /api/cdrs/by-receiver/{bNumber}` – Aranan numaraya göre filtre

 Docker ile Çalıştırma

## Docker ile Çalıştırma

```bash
docker-compose up --build
