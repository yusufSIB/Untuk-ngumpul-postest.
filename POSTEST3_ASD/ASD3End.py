class Node:
    def __init__(self, name, number, place):
        self.previous = None
        self.data_name = name
        self.data_number = number
        self.data_place = place
        self.text = None

class linkedList:
    def __init__(self):
        self.head = None

    def addContacts(self, new_val_name, new_val_number, new_val_place):
        new_node = Node(new_val_name, new_val_number, new_val_place)
        new_node.next = None
        if self.head is None :
            self.head = new_node
            return
        n = self.head
        while n.next is not None:
            n = n.next
        n.next = new_node
        return

    def seacrhContacts(self, findName):
        n = self.head
        if n is not None:
            while n is not None:
                if n.data_name == findName:
                    print(f"{n.data_name}, {n.data_number}, {n.data_place}")
                    n = n.next
                    awal()
        else:
            print("Kontak Tidak Ada")
            return

    def prefix_searchContacts(self, findAll):
        n = self.head
        if n is not None:
            count = 1
            while n is not None:
                if findAll in n.data_name:
                    print(f"{count}. {n.data_name}, {n.data_number}, {n.data_place}")
                n = n.next
                count = count + 1
        else:
            print("Kontak Tidak Ada")
            return

    def display(self):
        n = self.head
        if n is not None:
            count = 1
            while n is not None:
                print(f"{count}. {n.data_name}, {n.data_number}, {n.data_place}", end="\n")
                n = n.next
                count += 1
        else:
            print("Kontak Tidak Ada")


llt = linkedList()

isi_Kontak1 = ("Alex, 081258824204, Telkomsel").split(",")

llt.addContacts(isi_Kontak1[0], isi_Kontak1[1], isi_Kontak1[2])

def awal():
    print("""
    |============Kontak HP==============|
    |1. Tambah Data Kontak              |
    |2. Cari Nama Kontak                |
    |3. Mencari Inisial Kontak (Prefix) |
    |4. Lihat Semua Kontak              |
    |5. Exit                            |
    |===================================|
    """)
    menu = input("\nMasukan Pilihan : ")
    if menu == "1":
        JumlahKontak = int(input("Masukan Jumlah Kontak Yang Ingin Di Buat : "))
        for i in range(1, JumlahKontak+1):
            isi_Kontak = input("Masukan Kontak ke-{i} (Nama, Nomor Hp, Provider): ").split(",")
            llt.addContacts(isi_Kontak[0], isi_Kontak[1], isi_Kontak[2])
        print("\nKontak Berhasil Di Buat")
        awal()
    elif menu == "2":
        carikontak = input("Masukan Nama Yang Di Cari : ")#Cuman bisa nyari data yang sudah ada dari awal bukan data yang baru di tambahkan
        llt.seacrhContacts(carikontak)                    #Terus klo pake pilihan 2 ini Nama yang di cari barus betul-betul sesaui kalau tidak ngebug dia
        awal()
    elif menu == "3":
        cariPrefix = input("Masukan Inisial Nama Yang Akan Dicari : ")
        llt.prefix_searchContacts(cariPrefix)
        awal()
    elif menu == "4":
        print("\nDaftar Kontak")
        llt.display()
        awal()
    elif menu == "5":
        exit
    else:
            print("Pilihan Salah")
awal()