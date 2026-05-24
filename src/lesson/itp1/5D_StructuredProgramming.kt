package lesson.itp1

fun main() {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        // 3の倍数、または、文字列にしたときに "3" が含まれているか
        if (i % 3 == 0 || "3" in i.toString()) {
            print(" $i")
        }
    }
    println()
}

//// C++ 言語のプログラム
//void call(int n){   // n を引数に取る   n = 30 だったら？
//    int i = 1;   // i に 1 を代入する   i = 1
//    CHECK_NUM:   // ラベル
//    int x = i;   // x に i を代入する   x = 1
//    if ( x % 3 == 0 ){
//        // x が 3 で割り切れるとき
//        cout << " " << i;   // " i" がコンソールへ出力される
//        goto END_CHECK_NUM;   // END_CHECK_NUM: まで移動する
//    }
//    INCLUDE3:   // ラベル
//    if ( x % 10 == 3 ){
//        // x を 10 で割ったときの余りが 3 だったら
//        cout << " " << i;   // " i" がコンソールへ出力される
//        goto END_CHECK_NUM;   // END_CHECK_NUM: まで移動する
//    }
//    x /= 10;   // x = x / 10 と同じ意味
//    if ( x ) goto INCLUDE3;   // INCLUDE3: に移動する
//    END_CHECK_NUM:
//    if ( ++i <= n ) goto CHECK_NUM;   // i に 1 を足してから n と比較して ｉ が n 以下だったら CHECK_NUM: へジャンプする
//
//    cout << endl;   // 改行する
//}