package com.example.ai.stock.common.constant;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class StockConstant {

  public static List<String> ALL_CP = new ArrayList<>();

  @PostConstruct
  public static void init(){
    ALL_CP.add("VNINDEX");
    ALL_CP.addAll(CHUNG_KHOAN);
    ALL_CP.addAll(THEP);
    ALL_CP.addAll(PHAN_BON);
    ALL_CP.addAll(THUY_SAN);
    ALL_CP.addAll(DET_MAY);
    ALL_CP.addAll(DAU_KHI);
    ALL_CP.addAll(VAN_TAI_CANG_BIEN);
    ALL_CP.addAll(BAT_DONG_SAN);
    ALL_CP.addAll(NGAN_HANG);
    ALL_CP.addAll(BAN_LE);
    ALL_CP.addAll(DAU_TU_CONG);
    ALL_CP.addAll(NONG_NGHIEP);
    ALL_CP.addAll(BAO_HIEM);
    ALL_CP.addAll(DU_LICH_GT);
  }

  public static List<String> CHUNG_KHOAN =
      Arrays.asList(
          "SSI", "APG", "APS", "BSI", "BVS", "CTS", "EVS", "FTS", "HBS", "HCM", "IVS", "MBS", "ORS",
          "PSI", "SHS", "TVB", "TVS", "VCI", "VDS", "VFS", "VIG", "VIX", "VND", "WSS");
  public static List<String> THEP =
      Arrays.asList(
          "DTL", "HMC", "HPG", "HSG", "NKG", "POM", "SMC", "TLH", "VCA", "VIS", "KKC", "KMT", "SSM",
          "VGS", "DHB", "DGC", "AAA");

  public static List<String> PHAN_BON =
      Arrays.asList("DCM", "BFC", "DPM", "SFG", "VAF", "LAS", "NFC", "PMB", "PSW");

  public static List<String> THUY_SAN = Arrays.asList("VHC", "IDI", "ANV", "CMX");

  public static List<String> DET_MAY =
      Arrays.asList(
          "TNG", "GIL", "MSH", "KMR", "EVE", "ADS", "GMC", "TVT", "TCM", "HNI", "VGG", "M10", "HTG",
          "HSM", "HDM", "DM7", "NDT", "HCB", "HTG", "VGT");

  public static List<String> DAU_KHI =
      Arrays.asList(
          "BSR", "OIL", "PTV", "TOS", "PVE", "POS", "PEQ", "PVB", "PVC", "PVS", "PLX", "PVD");

  public static List<String> VAN_TAI_CANG_BIEN =
      Arrays.asList(
          "HAH", "DVP", "SGP", "TCL", "VOS", "SFI", "VTO", "CDN", "PHP", "GMD", "MVN", "VTP", "PDN",
          "TMS", "VSC");

  public static List<String> BAT_DONG_SAN =
      Arrays.asList(
          "CEO", "IDJ", "IDV", "TKC", "TIG", "SHN", "SDU", "RCL", "PVL", "NDN", "DIG", "DLG", "DRH",
          "DXG", "NLG", "HAG", "HDC", "HDG", "HQC", "IDI", "IJC", "ITA", "KBC", "KDH", "LCG",
          "NHA");

  public static List<String> NGAN_HANG =
      Arrays.asList(
          "ABB", "ACB", "BAB", "BID", "BVB", "CTG", "EIB", "EVF", "HDB", "KLB", "LPB", "MBB", "MSB",
          "NAB", "NVB", "OCB", "PGB", "SGB", "SHB", "SSB", "STB", "TCB", "TPB", "VAB", "VBB", "VCB",
          "VIB", "VPB");
  public static List<String> BAN_LE =
      Arrays.asList(
          "BTT", "CMV", "CTF", "DGW", "FRT", "HAX", "MWG", "MSN", "PNJ", "HTC", "TMC", "MCH");

  public static List<String> DAU_TU_CONG =
      Arrays.asList(
          "C47", "C4G", "CII", "CTD", "CTI", "CTR", "DPG", "EVG", "FCN", "G36", "HBC", "HHV", "HUB",
          "HUT", "HTN", "LCG", "MST", "PDB", "S99", "SCI", "VC9", "VCG", "ROS");

  public static List<String> DUOC =
      Arrays.asList(
          "TW3", "UPH", "YTC", "MKP", "MRF", "MTP", "NDC", "NDP", "DHD", "DHN", "DP1", "DP2", "DPH",
          "DPP", "DTG", "DTP", "DVN", "HDP", "AGP", "AMP", "BCP", "BIO", "CDP", "CNC", "DAN", "DBM",
          "DDN", "APC", "DBD", "DBT", "DCL", "DHG", "DMC", "IMP", "JVC", "OPC", "SPM", "TNH", "TRA",
          "VDP", "VMD", "AMV", "DNM", "DP3", "LDP", "MED", "MKV", "PMC", "PPP", "VHE");

  public static List<String> NONG_NGHIEP =
      Arrays.asList(
          "QNS", "SBT", "SLS", "BHS", "KTS", "LSS", "S33", "LTG", "AFX", "PAN", "AGM", "AGX", "TAR",
          "LAF", "NAF", "NDF", "HNG");

  public static List<String> BAO_HIEM =
      Arrays.asList("BMI", "BVH", "MIG", "PGI", "PRE", "PTI", "PVI", "VNR");

  public static List<String> DU_LICH_GT =
      Arrays.asList(
          "ATS", "CTC", "HHG", "KLF", "MAS", "DAH", "DSN", "HOT", "HVN", "VJC", "BCV", "BLN", "BSG",
          "BTV", "CXH");
}
