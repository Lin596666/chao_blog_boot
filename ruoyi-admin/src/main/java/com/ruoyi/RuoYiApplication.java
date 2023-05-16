package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class RuoYiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println(
                "                                  ...vr                    \n" +
                "                                  qBMBBBMBMY               \n" +
                "                                 8BBBBOBMRMV               \n" +
                "                               iMBMM5vOY:BMBBv             \n" +
                "             .r,               OEM;    .:  rBBBBBY         \n" +
                "             vUL               7EB    . :7.  LBMMEBM       \n" +
                "            .@Wwz.            :uvir   . i: .iLMOMOBM .     \n" +
                "             vv::r               iY.   ...rv,@arqiao.      \n" +
                "              Li.i:               v: . ::::7vOBBMBL..      \n" +
                "              ,i7: vSUi，         :M7.:.,:u08OP.  .        \n" +
                "                .N2k5ulju7,. .    :BMGiiL7   ,i,i          \n" +
                "                 :rL jFYjvjLY7r::.  ;v  vr... rE8q;,:,,    \n" +
                "                751jSLYPFu5uUoguohez ou., 1wjr2E8@rizero.  \n" +
                "                BB:FMi rM8EGOPF jF 15F70Mu1 5F25Luu25Gi    \n" +
                "             ivSvvXL   :v58ZOG ZXF2UUkF SFkU1u125uUUUZ,    \n" +
                "           :@kewensun.     ,iY20GOXSUMkSuS2F5XXrkUM5SEv.   \n" +
                "       .:iOBMBMBBOOBMUi;,       ,:8PkFP5NkPXkFFPEqokKZu.   \n" +
                "    .r qMqBBMOMMBMBBBM.           @kexiarli. S11kFSU5g5    \n" +
                "  .7BBOi 1L 1MMSEBBOMBB..,        8kg552kkuPP1Uokk1kUEJ    \n" +
                "  .;MBZ; iiMBMBMMOBEBu,           10kkS1F1X5kFP112F51kU    \n" +
                "    .rPY   OMEMEBEMEB2,.          rME5SSSFkXPGFNk SUPZ,    \n" +
                "            ::JuBML::r:.:.,,       SZPXOSKSP5kYGNP 15UBr   \n" +
                "                L,  :@sanshao.     : MNZqNXqSqqXk2EoPSXPE  \n" +
                "            viLBx.,,v8Bj.i:r7:,    2ZkqgOXXSNNONOLSKO      \n" +
                "          :r2. rMGMGi   . TY,li::i vOOPWNNSIEqPoSecbone    \n" +
                "          .ilr. .ikY.     vE.   iY.. 20Fq0g55F 1S2F22uw1M   "
        );
    }
}
