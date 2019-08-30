package com.example.bis;

import java.util.ArrayList;

public class Data_Bis {
    public static String[][] data = new String[][]{
            {"PO Putera Mulya", "PO Putera Mulya sebagai perusahaan pertama yang menyediakan bus double decker di Jawa. Lantai pertama bus hanya berkapasitas 6 kursi, memberikan ruang gerak yang leluasa bagi penumpang.", "https://s0.bukalapak.com/uploads/content_attachment/5db0b9af85d1e3dba7c25eb5/w-744/fasilitas-mewah-dengan-bus-Putera-Mulya.jpg"},
            {"PO Madu Kismo", "Bus Madu Kismo melayani kelas executive dengan fasilitas AC, LCD TV, dan toilet. Ditambah dengan menggunakan konfigurasi kursi 2-2, untuk rute wilayah Jawa, Bali, dan Madura.", "https://s3.bukalapak.com/uploads/content_attachment/84160919c3c518e9f5c25eb5/w-744/executive-dengan-bus-PO-Madu-Kismo.jpg"},
            {"PO Haryanto", "PO Haryanto ini menggunakan bus double decker, harga yang ditawarkan masih dapat dijangkau. Untuk rute Jakarta – Semarang – Kudus kamu hanya perlu membayar Rp200.000 Biaya tersebut sudah termasuk makan saat di perjalanan.", "https://s3.bukalapak.com/uploads/content_attachment/dfa9cb7246bad18c14c25eb5/w-744/Haryanto-yang-menyediakan-bus-double-decker.jpg"},
            {"PO Pahala Kencana ", "Tiket bus Pahala Kencana sendiri beragam, tersedia kelas executive dan super executive. Untuk kelas executive tujuan Jakarta-Semarang kamu harus membayar Rp200.000.", "https://s4.bukalapak.com/uploads/content_attachment/4a26cd5d3602eb6ce1c25eb5/w-744/Kencana-bus-ekonomis-yang-bersahabat.jpg"},
            {"PO Bus Akas", "Berlokasi di kawasan timur Jawa. Menguasai berbagai kota seperti Probolinggo, Situbondo, Jember, Banyuwangi, dan lain sebagainya. Kamu akan mendapatkan fasilitas kelas executive berupa WiFi, AC, makan serta reclining seat. Harga tiketnya hanya Rp 279.000-Rp 400.000-an.", "https://s3.bukalapak.com/uploads/content_attachment/38b1180b14fb0f8e50c25eb5/w-744/Akas-dengan-fasilitas-executive-class.jpg"},
            {"PO Harapan Jaya", "PO Harapan Jaya menggunakan bus tipe Avante dengan Scania K360IB. Bus ini melayani jalur Blitar – Cikarang – Jabodetabek – Merak dan berakhir di Lampung.", "https://s4.bukalapak.com/uploads/content_attachment/93403d758069acbbceb25eb5/w-744/Jaya-luxury-class.jpg"},
            {"PO Rosalia indah", "PO Rosalia Indah selalu mengutamakan kepuasan pelanggan, ada beberapa kelas armada yang disediakan diantaranya adalah kelas super executive dengan fasilitas reclining seat, full AC dan toilet.", "https://s1.bukalapak.com/uploads/content_attachment/b549d3a3049713941db25eb5/w-744/Rosalia-indah-yang-konsisten-dengan-pelayanan-terbaik-armadanya.jpg"},
            {"PO Lorena", "Bus Lorena kelas super executive mempunyai fasilitas 21 kursi dengan komposisi tempat duduk 1–2, full AC, toilet, Reclining seat, TV/DVD, GPS, selimut, bantal dan smoking area. Harga tiket bus Lorena ini tergantung jarak yang ditempuh, mulai dari Rp275.000–Rp455.000-an.", "https://s0.bukalapak.com/uploads/content_attachment/5f71e9f617c467cd1ab25eb5/w-744/memberikan-perjalanan-mewah-dengan-harga-terjangkau.jpg"},
            {"PO Gunung Harta", "PO Gunung Harta adalah armada yang mengutamakan kenyamanan penumpang. Bus ini dilengkapi dengan AC, audio speaker yang berkualitas, lampu baca, TV LED serta smoking room.", "https://s3.bukalapak.com/uploads/content_attachment/d256f9e2a366e957f5b25eb5/w-744/Harta-mengutamakan-kenyamanan-perjalanan-penumpang.jpg"},
            {"PO Sinar Jaya", "Tarifnya pun juga terbilang murah. Misalnya Jakarta-Yogyakarta untuk kelas eksekutif dibanderol dengan harga Rp120.000, Jakarta-Pekalongan Rp80.000, Jakarta-Tegal Rp75.000, dan Jakarta-Purwokerto Rp85.000.", "https://s3.bukalapak.com/bukalapak-kontenz-production/content_attachments/43398/w-744/sinar_jaya.jpg"},
    };

    public static ArrayList<Bis_Data> getListData() {
        ArrayList<Bis_Data> list = new ArrayList<>();
        for (String[] bData : data){
            Bis_Data data_bis = new Bis_Data();
            data_bis.setNama(bData[0]);
            data_bis.setDesc(bData[1]);
            data_bis.setFoto(bData[2]);
            list.add(data_bis);
        }
        return list;
    }
}
