package com.giabao.mathutil.main;

import com.giabao.mathutil.MathUtility;

/**
 *
 * @author 9550
 */
public class Main {

    public static void main(String[] args) {
        //TUI MUN TEST 5! CO BANG 120 KO?
        int n = 5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);
        System.out.println("5! expected: " + expected + "; actual: " + actual);

        n = 0;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println("0! expected: " + expected + "; actual: " + actual);
    }

    //UNIT TEST LEVEL - TEST TUNG DON THE, TUNG HAM
    //VAY LAM SAO?
    //CO NHIEU CACH:
    //1. CACH 1: DUNG sout() check( thuong dung trong oop)
    //2. CACH 2: DUNG JOptionPane CUA JAVA DESH DE POP UP IN KQ RA COI HAM CHAY SAO.
    //3. CACH 3: DUNG LOG FILE
    //DU LA CACH NAO THI TA CUNG CAN PHAI IN RA GIA TRI HAM DA TINH TOAN GOI LA ACTUAL VALUE
    //ROI TA DI SO SANH GTRI TRA VE CUA HAM CO NHU TA TINH TOAN TRC DO KO.
    //CAI TA HI VONG TRA VE : EXPECTED VALUE 
    //IF(ACTUAL VALUE == EXPECTED VALUE) -> HAM CHAY NGON
    //                !=                 -> FAIL
    //NGUYEN TAC VUA VIEC TEST : SO SANH ACTUAL VS EXPECTED.
    //3 CACH CHUNG 1 NGUYEN TAC: DUNG MAT TU SO SANH VA KET LUAN -> TIM AN SAI SOT KHI T PHAI XEM QUA NHIEU CAP VALUE
    //MOI N DE TA TEST TA GOI LA  TINH HUONG SAI HAM, 1 TINH HUONG TEST -> TEST CASE
    //CACH 4: KO CAN NHIN BANG MAT TUNG TRUONG HOP -> NHO MAY NHIN DUM
    //MAY QUET QUA TAT CA CAC CAP EXPECTED VS ACTUAL
    //NEU TAT CA TRUNG KHOP -> BAO XANH
    //NEU CO XUAT HIEN IT NHAT 1 THANG KO KHOP -> BAO DO -> CO VAN DE
    //MUON LAM DIEU NAY TA CAN THU VIEN 
    //  JAVA: JUnit, TestNG
    //  c#  : NUnit, MSTest, xUnit
    //  PHP : PHPUnit
    //moi ngon ngu deu co thu vien canh bao
}
