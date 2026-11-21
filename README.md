# TUGASGUI
# Form Biodata (Java Swing)

Aplikasi GUI sederhana berbasis **Java Swing** yang menampilkan form biodata mahasiswa. Dibuat untuk mata kuliah **Pemrograman Berorientasi Objek (PBO)**, Pertemuan 10: *Graphical User Interface (GUI) di Java*.

## Identitas

| | |
|---|---|
| **Nama** | Nabil |
| **NIM** | F1D02510127|
| **Mata Kuliah** | Pemrograman Berorientasi Objek |
| **Topik** | GUI Java (Swing) |

## Deskripsi

Program ini membuat satu jendela berisi form dengan tiga isian (Nama, NIM, Jurusan) dan dua tombol (Simpan dan Reset). Fokusnya adalah penerapan komponen dan layout manager Swing, bukan pemrosesan data.

> **Catatan:** Tombol Simpan dan Reset hanya ditampilkan dan belum memiliki aksi, karena materi *Event Handling* dibahas pada pertemuan berikutnya.

## Tampilan

```
┌───────────── Form Biodata ──────────────┐
│              FORM BIODATA               │   ← NORTH  (JLabel)
│                                         │
│   Nama     [NABIL NAUFAL ANUGRAH__]     │
│   NIM      [F1D02510127___________]     │   ← CENTER (JPanel, GridLayout 3x2)
│   Jurusan  [INFORMATIKA___________]     │
│                                         │
│          [ Simpan ]  [ Reset ]          │   ← SOUTH  (JPanel, FlowLayout)
└─────────────────────────────────────────┘
```

## Struktur Komponen

```
JFrame
 └─ Content Pane  [BorderLayout]
     ├─ NORTH  : JLabel "FORM BIODATA"
     ├─ CENTER : JPanel [GridLayout 3x2]
     │            ├─ JLabel "Nama"     + JTextField
     │            ├─ JLabel "NIM"      + JTextField
     │            └─ JLabel "Jurusan"  + JTextField
     └─ SOUTH  : JPanel [FlowLayout]
                  ├─ JButton "Simpan"
                  └─ JButton "Reset"
```

## Konsep yang Digunakan

| Konsep | Penerapan di kode |
|---|---|
| Top-level container | `JFrame` sebagai jendela utama |
| Content pane | `frame.getContentPane()` untuk mengatur layout dan menambah komponen |
| Atomic component | `JLabel`, `JTextField`, `JButton` |
| Intermediate container | `JPanel` untuk mengelompokkan komponen |
| `BorderLayout` | Tata letak utama jendela (NORTH, CENTER, SOUTH) |
| `GridLayout` | Tata letak form (3 baris x 2 kolom) |
| `FlowLayout` | Tata letak default `JPanel` untuk barisan tombol |
| Konstruktor | `new JFrame(...)`, `new JLabel(...)`, `new GridLayout(...)`, dan lainnya |

## Persyaratan

- **JDK 8 atau lebih baru** (disarankan JDK 17+)
- **Visual Studio Code** dengan ekstensi *Extension Pack for Java* (opsional, bisa juga lewat terminal)

Cek instalasi Java:

```bash
java -version
javac -version
```

## Cara Menjalankan

### Lewat VS Code

1. Buka folder proyek lewat *File → Open Folder*.
2. Pastikan file `FormBiodata.java` ada di dalam folder tersebut.
3. Buka `FormBiodata.java`, lalu klik tombol **▶ Run** di pojok kanan atas editor.

### Lewat terminal

```bash
javac FormBiodata.java
java FormBiodata
```

> Nama file harus `FormBiodata.java` karena nama class publiknya adalah `FormBiodata`.

## Struktur Proyek

```
FormBiodata/
├── FormBiodata.java
└── README.md
```

## Penjelasan Singkat Kode

1. **Membuat jendela:** `JFrame` dibuat dengan judul "Form Biodata", dan `EXIT_ON_CLOSE` membuat program berhenti saat jendela ditutup.
2. **Mengatur layout:** `BorderLayout(5, 5)` dipasang pada content pane.
3. **Membuat komponen:** judul, tiga label, tiga kolom isian, dan dua tombol.
4. **Mengelompokkan:** `panelForm` (`GridLayout 3x2`) untuk label dan isian, `panelTombol` (`FlowLayout`) untuk tombol.
5. **Menyusun:** judul di NORTH, form di CENTER, tombol di SOUTH.
6. **Menampilkan:** ukuran jendela 350 x 250 piksel, lalu `setVisible(true)`.

