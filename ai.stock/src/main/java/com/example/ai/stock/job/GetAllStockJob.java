package com.example.ai.stock.job;

import com.example.ai.stock.client.StockInfoTemp;
import com.example.ai.stock.entity.StockCategoryEntity;
import com.example.ai.stock.repository.StockRepository;
import com.example.ai.stock.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetAllStockJob implements JobBackground {

  @Autowired private StockRepository stockRepository;

  @EventListener(ApplicationReadyEvent.class)
  @Override
  public void process() throws JsonProcessingException {
    String str =
        "[\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:21\",\n"
            + "                \"stockSymbol\": \"AAA\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:9\",\n"
            + "                \"stockSymbol\": \"AAM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:702\",\n"
            + "                \"stockSymbol\": \"AAT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4413\",\n"
            + "                \"stockSymbol\": \"ABR\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:234\",\n"
            + "                \"stockSymbol\": \"ABS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3\",\n"
            + "                \"stockSymbol\": \"ABT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:436\",\n"
            + "                \"stockSymbol\": \"ACB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:15\",\n"
            + "                \"stockSymbol\": \"ACC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4619\",\n"
            + "                \"stockSymbol\": \"ACG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4\",\n"
            + "                \"stockSymbol\": \"ACL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:682\",\n"
            + "                \"stockSymbol\": \"ADG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4787\",\n"
            + "                \"stockSymbol\": \"ADP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:19\",\n"
            + "                \"stockSymbol\": \"ADS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:156\",\n"
            + "                \"stockSymbol\": \"AGG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:17\",\n"
            + "                \"stockSymbol\": \"AGM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:10\",\n"
            + "                \"stockSymbol\": \"AGR\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:5\",\n"
            + "                \"stockSymbol\": \"ANV\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:13\",\n"
            + "                \"stockSymbol\": \"APC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:22\",\n"
            + "                \"stockSymbol\": \"APG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:307\",\n"
            + "                \"stockSymbol\": \"APH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:354\",\n"
            + "                \"stockSymbol\": \"ASG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:12\",\n"
            + "                \"stockSymbol\": \"ASM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:7\",\n"
            + "                \"stockSymbol\": \"ASP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:24\",\n"
            + "                \"stockSymbol\": \"AST\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4356\",\n"
            + "                \"stockSymbol\": \"BAF\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:190\",\n"
            + "                \"stockSymbol\": \"BBC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:212\",\n"
            + "                \"stockSymbol\": \"BCE\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:218\",\n"
            + "                \"stockSymbol\": \"BCG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:338\",\n"
            + "                \"stockSymbol\": \"BCM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:219\",\n"
            + "                \"stockSymbol\": \"BFC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:220\",\n"
            + "                \"stockSymbol\": \"BHN\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:215\",\n"
            + "                \"stockSymbol\": \"BIC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:217\",\n"
            + "                \"stockSymbol\": \"BID\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:447\",\n"
            + "                \"stockSymbol\": \"BKG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:199\",\n"
            + "                \"stockSymbol\": \"BMC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:206\",\n"
            + "                \"stockSymbol\": \"BMI\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:195\",\n"
            + "                \"stockSymbol\": \"BMP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:216\",\n"
            + "                \"stockSymbol\": \"BRC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:214\",\n"
            + "                \"stockSymbol\": \"BSI\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:210\",\n"
            + "                \"stockSymbol\": \"BTP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:211\",\n"
            + "                \"stockSymbol\": \"BTT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:209\",\n"
            + "                \"stockSymbol\": \"BVH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:221\",\n"
            + "                \"stockSymbol\": \"BWE\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:598\",\n"
            + "                \"stockSymbol\": \"C32\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:593\",\n"
            + "                \"stockSymbol\": \"C47\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:601\",\n"
            + "                \"stockSymbol\": \"CAV\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:586\",\n"
            + "                \"stockSymbol\": \"CCI\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:592\",\n"
            + "                \"stockSymbol\": \"CCL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:589\",\n"
            + "                \"stockSymbol\": \"CDC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:604\",\n"
            + "                \"stockSymbol\": \"CHP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:595\",\n"
            + "                \"stockSymbol\": \"CIG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:572\",\n"
            + "                \"stockSymbol\": \"CII\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:236\",\n"
            + "                \"stockSymbol\": \"CKG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:575\",\n"
            + "                \"stockSymbol\": \"CLC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:599\",\n"
            + "                \"stockSymbol\": \"CLL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:591\",\n"
            + "                \"stockSymbol\": \"CLW\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:583\",\n"
            + "                \"stockSymbol\": \"CMG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:587\",\n"
            + "                \"stockSymbol\": \"CMV\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:590\",\n"
            + "                \"stockSymbol\": \"CMX\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:596\",\n"
            + "                \"stockSymbol\": \"CNG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:574\",\n"
            + "                \"stockSymbol\": \"COM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:46\",\n"
            + "                \"stockSymbol\": \"CRC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:48\",\n"
            + "                \"stockSymbol\": \"CRE\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:581\",\n"
            + "                \"stockSymbol\": \"CSM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:603\",\n"
            + "                \"stockSymbol\": \"CSV\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:582\",\n"
            + "                \"stockSymbol\": \"CTD\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:606\",\n"
            + "                \"stockSymbol\": \"CTF\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:580\",\n"
            + "                \"stockSymbol\": \"CTG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:585\",\n"
            + "                \"stockSymbol\": \"CTI\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4402\",\n"
            + "                \"stockSymbol\": \"CTR\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:607\",\n"
            + "                \"stockSymbol\": \"CTS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:608\",\n"
            + "                \"stockSymbol\": \"CVT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:642\",\n"
            + "                \"stockSymbol\": \"D2D\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:647\",\n"
            + "                \"stockSymbol\": \"DAG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:658\",\n"
            + "                \"stockSymbol\": \"DAH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:657\",\n"
            + "                \"stockSymbol\": \"DAT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:101\",\n"
            + "                \"stockSymbol\": \"DBC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:33\",\n"
            + "                \"stockSymbol\": \"DBD\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:397\",\n"
            + "                \"stockSymbol\": \"DBT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:370\",\n"
            + "                \"stockSymbol\": \"DC4\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:640\",\n"
            + "                \"stockSymbol\": \"DCL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:655\",\n"
            + "                \"stockSymbol\": \"DCM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:308\",\n"
            + "                \"stockSymbol\": \"DGC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:656\",\n"
            + "                \"stockSymbol\": \"DGW\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:622\",\n"
            + "                \"stockSymbol\": \"DHA\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:641\",\n"
            + "                \"stockSymbol\": \"DHC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:629\",\n"
            + "                \"stockSymbol\": \"DHG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:654\",\n"
            + "                \"stockSymbol\": \"DHM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:643\",\n"
            + "                \"stockSymbol\": \"DIG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:649\",\n"
            + "                \"stockSymbol\": \"DLG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:631\",\n"
            + "                \"stockSymbol\": \"DMC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:30\",\n"
            + "                \"stockSymbol\": \"DPG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:634\",\n"
            + "                \"stockSymbol\": \"DPM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:635\",\n"
            + "                \"stockSymbol\": \"DPR\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:637\",\n"
            + "                \"stockSymbol\": \"DQC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:633\",\n"
            + "                \"stockSymbol\": \"DRC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:651\",\n"
            + "                \"stockSymbol\": \"DRH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:653\",\n"
            + "                \"stockSymbol\": \"DRL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:652\",\n"
            + "                \"stockSymbol\": \"DSN\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:650\",\n"
            + "                \"stockSymbol\": \"DTA\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:648\",\n"
            + "                \"stockSymbol\": \"DTL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:630\",\n"
            + "                \"stockSymbol\": \"DTT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:644\",\n"
            + "                \"stockSymbol\": \"DVP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:646\",\n"
            + "                \"stockSymbol\": \"DXG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3982\",\n"
            + "                \"stockSymbol\": \"DXS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:638\",\n"
            + "                \"stockSymbol\": \"DXV\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:792\",\n"
            + "                \"stockSymbol\": \"EIB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:793\",\n"
            + "                \"stockSymbol\": \"ELC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:794\",\n"
            + "                \"stockSymbol\": \"EVE\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4382\",\n"
            + "                \"stockSymbol\": \"EVF\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:797\",\n"
            + "                \"stockSymbol\": \"EVG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:979\",\n"
            + "                \"stockSymbol\": \"FCM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:978\",\n"
            + "                \"stockSymbol\": \"FCN\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:976\",\n"
            + "                \"stockSymbol\": \"FDC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:53\",\n"
            + "                \"stockSymbol\": \"FIR\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:981\",\n"
            + "                \"stockSymbol\": \"FIT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:973\",\n"
            + "                \"stockSymbol\": \"FMC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:974\",\n"
            + "                \"stockSymbol\": \"FPT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:26\",\n"
            + "                \"stockSymbol\": \"FRT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:983\",\n"
            + "                \"stockSymbol\": \"FTS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4281\",\n"
            + "                \"stockSymbol\": \"FUCTVGF3\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4609\",\n"
            + "                \"stockSymbol\": \"FUCTVGF4\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:985\",\n"
            + "                \"stockSymbol\": \"FUCVREIT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1152\",\n"
            + "                \"stockSymbol\": \"GAS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1149\",\n"
            + "                \"stockSymbol\": \"GDT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:108\",\n"
            + "                \"stockSymbol\": \"GEG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1154\",\n"
            + "                \"stockSymbol\": \"GEX\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1145\",\n"
            + "                \"stockSymbol\": \"GIL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1147\",\n"
            + "                \"stockSymbol\": \"GMC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1146\",\n"
            + "                \"stockSymbol\": \"GMD\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4383\",\n"
            + "                \"stockSymbol\": \"GMH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1151\",\n"
            + "                \"stockSymbol\": \"GSP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1148\",\n"
            + "                \"stockSymbol\": \"GTA\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:233\",\n"
            + "                \"stockSymbol\": \"GVR\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1364\",\n"
            + "                \"stockSymbol\": \"HAG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1380\",\n"
            + "                \"stockSymbol\": \"HAH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1291\",\n"
            + "                \"stockSymbol\": \"HAP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1379\",\n"
            + "                \"stockSymbol\": \"HAR\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1292\",\n"
            + "                \"stockSymbol\": \"HAS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1337\",\n"
            + "                \"stockSymbol\": \"HAX\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1339\",\n"
            + "                \"stockSymbol\": \"HBC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1382\",\n"
            + "                \"stockSymbol\": \"HCD\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1366\",\n"
            + "                \"stockSymbol\": \"HCM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1386\",\n"
            + "                \"stockSymbol\": \"HDB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1348\",\n"
            + "                \"stockSymbol\": \"HDC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1369\",\n"
            + "                \"stockSymbol\": \"HDG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:685\",\n"
            + "                \"stockSymbol\": \"HHP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1378\",\n"
            + "                \"stockSymbol\": \"HHS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4396\",\n"
            + "                \"stockSymbol\": \"HHV\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1383\",\n"
            + "                \"stockSymbol\": \"HID\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1384\",\n"
            + "                \"stockSymbol\": \"HII\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1336\",\n"
            + "                \"stockSymbol\": \"HMC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1381\",\n"
            + "                \"stockSymbol\": \"HNG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1354\",\n"
            + "                \"stockSymbol\": \"HPG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:41\",\n"
            + "                \"stockSymbol\": \"HPX\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1372\",\n"
            + "                \"stockSymbol\": \"HQC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1338\",\n"
            + "                \"stockSymbol\": \"HRC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1363\",\n"
            + "                \"stockSymbol\": \"HSG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:28\",\n"
            + "                \"stockSymbol\": \"HSL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1351\",\n"
            + "                \"stockSymbol\": \"HT1\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1373\",\n"
            + "                \"stockSymbol\": \"HTI\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1374\",\n"
            + "                \"stockSymbol\": \"HTL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:58\",\n"
            + "                \"stockSymbol\": \"HTN\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1318\",\n"
            + "                \"stockSymbol\": \"HTV\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1377\",\n"
            + "                \"stockSymbol\": \"HU1\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:68\",\n"
            + "                \"stockSymbol\": \"HUB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:60\",\n"
            + "                \"stockSymbol\": \"HVH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:69\",\n"
            + "                \"stockSymbol\": \"HVN\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1371\",\n"
            + "                \"stockSymbol\": \"HVX\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1422\",\n"
            + "                \"stockSymbol\": \"IBC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:163\",\n"
            + "                \"stockSymbol\": \"ICT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1420\",\n"
            + "                \"stockSymbol\": \"IDI\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1419\",\n"
            + "                \"stockSymbol\": \"IJC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:70\",\n"
            + "                \"stockSymbol\": \"ILB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1416\",\n"
            + "                \"stockSymbol\": \"IMP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1415\",\n"
            + "                \"stockSymbol\": \"ITA\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1418\",\n"
            + "                \"stockSymbol\": \"ITC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1421\",\n"
            + "                \"stockSymbol\": \"ITD\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1604\",\n"
            + "                \"stockSymbol\": \"JVC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1731\",\n"
            + "                \"stockSymbol\": \"KBC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1727\",\n"
            + "                \"stockSymbol\": \"KDC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1734\",\n"
            + "                \"stockSymbol\": \"KDH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3984\",\n"
            + "                \"stockSymbol\": \"KHG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1728\",\n"
            + "                \"stockSymbol\": \"KHP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1729\",\n"
            + "                \"stockSymbol\": \"KMR\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:100\",\n"
            + "                \"stockSymbol\": \"KOS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1738\",\n"
            + "                \"stockSymbol\": \"KPF\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1733\",\n"
            + "                \"stockSymbol\": \"KSB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1891\",\n"
            + "                \"stockSymbol\": \"L10\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1888\",\n"
            + "                \"stockSymbol\": \"LAF\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1889\",\n"
            + "                \"stockSymbol\": \"LBM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1893\",\n"
            + "                \"stockSymbol\": \"LCG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1899\",\n"
            + "                \"stockSymbol\": \"LDG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1900\",\n"
            + "                \"stockSymbol\": \"LEC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1890\",\n"
            + "                \"stockSymbol\": \"LGC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1894\",\n"
            + "                \"stockSymbol\": \"LGL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1896\",\n"
            + "                \"stockSymbol\": \"LHG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1895\",\n"
            + "                \"stockSymbol\": \"LIX\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1897\",\n"
            + "                \"stockSymbol\": \"LM8\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:416\",\n"
            + "                \"stockSymbol\": \"LPB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:1892\",\n"
            + "                \"stockSymbol\": \"LSS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2027\",\n"
            + "                \"stockSymbol\": \"MBB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2019\",\n"
            + "                \"stockSymbol\": \"MCP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2026\",\n"
            + "                \"stockSymbol\": \"MDG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2017\",\n"
            + "                \"stockSymbol\": \"MHC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:666\",\n"
            + "                \"stockSymbol\": \"MIG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:443\",\n"
            + "                \"stockSymbol\": \"MSB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:59\",\n"
            + "                \"stockSymbol\": \"MSH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2024\",\n"
            + "                \"stockSymbol\": \"MSN\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2028\",\n"
            + "                \"stockSymbol\": \"MWG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2199\",\n"
            + "                \"stockSymbol\": \"NAF\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2186\",\n"
            + "                \"stockSymbol\": \"NAV\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2188\",\n"
            + "                \"stockSymbol\": \"NBB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2197\",\n"
            + "                \"stockSymbol\": \"NCT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:667\",\n"
            + "                \"stockSymbol\": \"NHA\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:145\",\n"
            + "                \"stockSymbol\": \"NHH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4321\",\n"
            + "                \"stockSymbol\": \"NHT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2195\",\n"
            + "                \"stockSymbol\": \"NKG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2196\",\n"
            + "                \"stockSymbol\": \"NLG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2193\",\n"
            + "                \"stockSymbol\": \"NNC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4639\",\n"
            + "                \"stockSymbol\": \"NO1\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2185\",\n"
            + "                \"stockSymbol\": \"NSC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2198\",\n"
            + "                \"stockSymbol\": \"NT2\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2187\",\n"
            + "                \"stockSymbol\": \"NTL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2200\",\n"
            + "                \"stockSymbol\": \"NVL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2191\",\n"
            + "                \"stockSymbol\": \"NVT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:670\",\n"
            + "                \"stockSymbol\": \"OCB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2340\",\n"
            + "                \"stockSymbol\": \"OGC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2339\",\n"
            + "                \"stockSymbol\": \"OPC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4301\",\n"
            + "                \"stockSymbol\": \"ORS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2549\",\n"
            + "                \"stockSymbol\": \"PAC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2570\",\n"
            + "                \"stockSymbol\": \"PAN\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2575\",\n"
            + "                \"stockSymbol\": \"PC1\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2573\",\n"
            + "                \"stockSymbol\": \"PDN\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2567\",\n"
            + "                \"stockSymbol\": \"PDR\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2552\",\n"
            + "                \"stockSymbol\": \"PET\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2546\",\n"
            + "                \"stockSymbol\": \"PGC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2560\",\n"
            + "                \"stockSymbol\": \"PGD\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2572\",\n"
            + "                \"stockSymbol\": \"PGI\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4401\",\n"
            + "                \"stockSymbol\": \"PGV\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:50\",\n"
            + "                \"stockSymbol\": \"PHC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2558\",\n"
            + "                \"stockSymbol\": \"PHR\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2554\",\n"
            + "                \"stockSymbol\": \"PIT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2550\",\n"
            + "                \"stockSymbol\": \"PJT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2577\",\n"
            + "                \"stockSymbol\": \"PLP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2576\",\n"
            + "                \"stockSymbol\": \"PLX\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2579\",\n"
            + "                \"stockSymbol\": \"PMG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2545\",\n"
            + "                \"stockSymbol\": \"PNC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2557\",\n"
            + "                \"stockSymbol\": \"PNJ\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2562\",\n"
            + "                \"stockSymbol\": \"POM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:66\",\n"
            + "                \"stockSymbol\": \"POW\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2551\",\n"
            + "                \"stockSymbol\": \"PPC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:288\",\n"
            + "                \"stockSymbol\": \"PSH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2571\",\n"
            + "                \"stockSymbol\": \"PTB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2556\",\n"
            + "                \"stockSymbol\": \"PTC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2568\",\n"
            + "                \"stockSymbol\": \"PTL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2548\",\n"
            + "                \"stockSymbol\": \"PVD\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4662\",\n"
            + "                \"stockSymbol\": \"PVP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2553\",\n"
            + "                \"stockSymbol\": \"PVT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2698\",\n"
            + "                \"stockSymbol\": \"QBS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2697\",\n"
            + "                \"stockSymbol\": \"QCG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2737\",\n"
            + "                \"stockSymbol\": \"RAL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2739\",\n"
            + "                \"stockSymbol\": \"RDP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2735\",\n"
            + "                \"stockSymbol\": \"REE\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2944\",\n"
            + "                \"stockSymbol\": \"S4A\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2947\",\n"
            + "                \"stockSymbol\": \"SAB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2902\",\n"
            + "                \"stockSymbol\": \"SAM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2904\",\n"
            + "                \"stockSymbol\": \"SAV\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2932\",\n"
            + "                \"stockSymbol\": \"SBA\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2923\",\n"
            + "                \"stockSymbol\": \"SBT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2948\",\n"
            + "                \"stockSymbol\": \"SBV\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2919\",\n"
            + "                \"stockSymbol\": \"SC5\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2914\",\n"
            + "                \"stockSymbol\": \"SCD\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2945\",\n"
            + "                \"stockSymbol\": \"SCR\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:43\",\n"
            + "                \"stockSymbol\": \"SCS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2905\",\n"
            + "                \"stockSymbol\": \"SFC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2942\",\n"
            + "                \"stockSymbol\": \"SFG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2918\",\n"
            + "                \"stockSymbol\": \"SFI\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:42\",\n"
            + "                \"stockSymbol\": \"SGN\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2950\",\n"
            + "                \"stockSymbol\": \"SGR\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2922\",\n"
            + "                \"stockSymbol\": \"SGT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2946\",\n"
            + "                \"stockSymbol\": \"SHA\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4126\",\n"
            + "                \"stockSymbol\": \"SHB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2928\",\n"
            + "                \"stockSymbol\": \"SHI\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2941\",\n"
            + "                \"stockSymbol\": \"SHP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:4802\",\n"
            + "                \"stockSymbol\": \"SIP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2912\",\n"
            + "                \"stockSymbol\": \"SJD\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2949\",\n"
            + "                \"stockSymbol\": \"SJF\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2907\",\n"
            + "                \"stockSymbol\": \"SJS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2940\",\n"
            + "                \"stockSymbol\": \"SKG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2935\",\n"
            + "                \"stockSymbol\": \"SMA\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:44\",\n"
            + "                \"stockSymbol\": \"SMB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2911\",\n"
            + "                \"stockSymbol\": \"SMC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2931\",\n"
            + "                \"stockSymbol\": \"SPM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2926\",\n"
            + "                \"stockSymbol\": \"SRC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2927\",\n"
            + "                \"stockSymbol\": \"SRF\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:703\",\n"
            + "                \"stockSymbol\": \"SSB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2906\",\n"
            + "                \"stockSymbol\": \"SSC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2920\",\n"
            + "                \"stockSymbol\": \"SSI\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2921\",\n"
            + "                \"stockSymbol\": \"ST8\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2908\",\n"
            + "                \"stockSymbol\": \"STB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2930\",\n"
            + "                \"stockSymbol\": \"STG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2943\",\n"
            + "                \"stockSymbol\": \"STK\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2925\",\n"
            + "                \"stockSymbol\": \"SVC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:671\",\n"
            + "                \"stockSymbol\": \"SVD\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2938\",\n"
            + "                \"stockSymbol\": \"SVI\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2937\",\n"
            + "                \"stockSymbol\": \"SVT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:67\",\n"
            + "                \"stockSymbol\": \"SZC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:2924\",\n"
            + "                \"stockSymbol\": \"SZL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3489\",\n"
            + "                \"stockSymbol\": \"TBC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:32\",\n"
            + "                \"stockSymbol\": \"TCB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3507\",\n"
            + "                \"stockSymbol\": \"TCD\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3506\",\n"
            + "                \"stockSymbol\": \"TCH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3492\",\n"
            + "                \"stockSymbol\": \"TCL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3483\",\n"
            + "                \"stockSymbol\": \"TCM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3502\",\n"
            + "                \"stockSymbol\": \"TCO\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3479\",\n"
            + "                \"stockSymbol\": \"TCR\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3504\",\n"
            + "                \"stockSymbol\": \"TCT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3496\",\n"
            + "                \"stockSymbol\": \"TDC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3510\",\n"
            + "                \"stockSymbol\": \"TDG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3476\",\n"
            + "                \"stockSymbol\": \"TDH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:55\",\n"
            + "                \"stockSymbol\": \"TDM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:367\",\n"
            + "                \"stockSymbol\": \"TDP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3499\",\n"
            + "                \"stockSymbol\": \"TDW\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3514\",\n"
            + "                \"stockSymbol\": \"TEG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:31\",\n"
            + "                \"stockSymbol\": \"TGG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3501\",\n"
            + "                \"stockSymbol\": \"THG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3505\",\n"
            + "                \"stockSymbol\": \"TIP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3490\",\n"
            + "                \"stockSymbol\": \"TIX\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3512\",\n"
            + "                \"stockSymbol\": \"TLD\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3495\",\n"
            + "                \"stockSymbol\": \"TLG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3494\",\n"
            + "                \"stockSymbol\": \"TLH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3487\",\n"
            + "                \"stockSymbol\": \"TMP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3275\",\n"
            + "                \"stockSymbol\": \"TMS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3493\",\n"
            + "                \"stockSymbol\": \"TMT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:73\",\n"
            + "                \"stockSymbol\": \"TN1\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3362\",\n"
            + "                \"stockSymbol\": \"TNA\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3481\",\n"
            + "                \"stockSymbol\": \"TNC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:612\",\n"
            + "                \"stockSymbol\": \"TNH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3508\",\n"
            + "                \"stockSymbol\": \"TNI\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3497\",\n"
            + "                \"stockSymbol\": \"TNT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:25\",\n"
            + "                \"stockSymbol\": \"TPB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3484\",\n"
            + "                \"stockSymbol\": \"TPC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3486\",\n"
            + "                \"stockSymbol\": \"TRA\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3480\",\n"
            + "                \"stockSymbol\": \"TRC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3482\",\n"
            + "                \"stockSymbol\": \"TSC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:348\",\n"
            + "                \"stockSymbol\": \"TTA\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:45\",\n"
            + "                \"stockSymbol\": \"TTB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:61\",\n"
            + "                \"stockSymbol\": \"TTE\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3485\",\n"
            + "                \"stockSymbol\": \"TTF\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:74\",\n"
            + "                \"stockSymbol\": \"TV2\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:36\",\n"
            + "                \"stockSymbol\": \"TVB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3503\",\n"
            + "                \"stockSymbol\": \"TVS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3511\",\n"
            + "                \"stockSymbol\": \"TVT\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3434\",\n"
            + "                \"stockSymbol\": \"TYA\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3637\",\n"
            + "                \"stockSymbol\": \"UIC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3841\",\n"
            + "                \"stockSymbol\": \"VAF\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:701\",\n"
            + "                \"stockSymbol\": \"VCA\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3825\",\n"
            + "                \"stockSymbol\": \"VCB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3840\",\n"
            + "                \"stockSymbol\": \"VCF\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:446\",\n"
            + "                \"stockSymbol\": \"VCG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3849\",\n"
            + "                \"stockSymbol\": \"VCI\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3851\",\n"
            + "                \"stockSymbol\": \"VDP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3850\",\n"
            + "                \"stockSymbol\": \"VDS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3830\",\n"
            + "                \"stockSymbol\": \"VFG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:72\",\n"
            + "                \"stockSymbol\": \"VGC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3815\",\n"
            + "                \"stockSymbol\": \"VHC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:29\",\n"
            + "                \"stockSymbol\": \"VHM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:417\",\n"
            + "                \"stockSymbol\": \"VIB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3813\",\n"
            + "                \"stockSymbol\": \"VIC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3808\",\n"
            + "                \"stockSymbol\": \"VID\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3807\",\n"
            + "                \"stockSymbol\": \"VIP\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:613\",\n"
            + "                \"stockSymbol\": \"VIX\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3847\",\n"
            + "                \"stockSymbol\": \"VJC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3837\",\n"
            + "                \"stockSymbol\": \"VMD\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3853\",\n"
            + "                \"stockSymbol\": \"VND\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3812\",\n"
            + "                \"stockSymbol\": \"VNE\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3829\",\n"
            + "                \"stockSymbol\": \"VNG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3826\",\n"
            + "                \"stockSymbol\": \"VNL\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3801\",\n"
            + "                \"stockSymbol\": \"VNM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3821\",\n"
            + "                \"stockSymbol\": \"VNS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3835\",\n"
            + "                \"stockSymbol\": \"VOS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3852\",\n"
            + "                \"stockSymbol\": \"VPB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3858\",\n"
            + "                \"stockSymbol\": \"VPD\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3857\",\n"
            + "                \"stockSymbol\": \"VPG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3827\",\n"
            + "                \"stockSymbol\": \"VPH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:37\",\n"
            + "                \"stockSymbol\": \"VPI\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3842\",\n"
            + "                \"stockSymbol\": \"VPS\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3833\",\n"
            + "                \"stockSymbol\": \"VRC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3854\",\n"
            + "                \"stockSymbol\": \"VRE\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3816\",\n"
            + "                \"stockSymbol\": \"VSC\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3802\",\n"
            + "                \"stockSymbol\": \"VSH\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3839\",\n"
            + "                \"stockSymbol\": \"VSI\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3810\",\n"
            + "                \"stockSymbol\": \"VTB\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:3814\",\n"
            + "                \"stockSymbol\": \"VTO\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:47\",\n"
            + "                \"stockSymbol\": \"YBM\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"stockNo\": \"hose:34\",\n"
            + "                \"stockSymbol\": \"YEG\",\n"
            + "                \"exchange\": \"hose\"\n"
            + "            }\n"
            + "        ]";

    String str2 = "[\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:921\",\n" +
            "                \"stockSymbol\": \"BCC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1301\",\n" +
            "                \"stockSymbol\": \"BVS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:72819\",\n" +
            "                \"stockSymbol\": \"CEO\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:77940\",\n" +
            "                \"stockSymbol\": \"DDG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76662\",\n" +
            "                \"stockSymbol\": \"DTD\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:81184\",\n" +
            "                \"stockSymbol\": \"DVM\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:81\",\n" +
            "                \"stockSymbol\": \"DXP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:20916\",\n" +
            "                \"stockSymbol\": \"HLD\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:4204\",\n" +
            "                \"stockSymbol\": \"HUT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76739\",\n" +
            "                \"stockSymbol\": \"IDC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:16676\",\n" +
            "                \"stockSymbol\": \"L14\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:4184\",\n" +
            "                \"stockSymbol\": \"L18\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:17996\",\n" +
            "                \"stockSymbol\": \"LAS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8224\",\n" +
            "                \"stockSymbol\": \"LHC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:74399\",\n" +
            "                \"stockSymbol\": \"MBS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1721\",\n" +
            "                \"stockSymbol\": \"NBC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1181\",\n" +
            "                \"stockSymbol\": \"NTP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1502\",\n" +
            "                \"stockSymbol\": \"PLC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3004\",\n" +
            "                \"stockSymbol\": \"PVC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:2724\",\n" +
            "                \"stockSymbol\": \"PVS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6604\",\n" +
            "                \"stockSymbol\": \"SHS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:19696\",\n" +
            "                \"stockSymbol\": \"SLS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:78140\",\n" +
            "                \"stockSymbol\": \"TAR\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:5424\",\n" +
            "                \"stockSymbol\": \"TDN\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:13495\",\n" +
            "                \"stockSymbol\": \"TIG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3104\",\n" +
            "                \"stockSymbol\": \"TNG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:14776\",\n" +
            "                \"stockSymbol\": \"TVD\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3304\",\n" +
            "                \"stockSymbol\": \"VC3\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3284\",\n" +
            "                \"stockSymbol\": \"VCS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7884\",\n" +
            "                \"stockSymbol\": \"VIG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            }\n" +
            "        ]";

    String str3 = "[\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:77359\",\n" +
            "                \"stockSymbol\": \"AAV\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:14696\",\n" +
            "                \"stockSymbol\": \"ADC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6864\",\n" +
            "                \"stockSymbol\": \"ALT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:17616\",\n" +
            "                \"stockSymbol\": \"AMC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:9464\",\n" +
            "                \"stockSymbol\": \"AME\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8144\",\n" +
            "                \"stockSymbol\": \"AMV\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:13273\",\n" +
            "                \"stockSymbol\": \"API\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:9064\",\n" +
            "                \"stockSymbol\": \"APS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:13072\",\n" +
            "                \"stockSymbol\": \"ARM\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:74402\",\n" +
            "                \"stockSymbol\": \"ATS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76841\",\n" +
            "                \"stockSymbol\": \"BAB\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:75742\",\n" +
            "                \"stockSymbol\": \"BAX\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:121\",\n" +
            "                \"stockSymbol\": \"BBS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:921\",\n" +
            "                \"stockSymbol\": \"BCC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:79161\",\n" +
            "                \"stockSymbol\": \"BCF\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8184\",\n" +
            "                \"stockSymbol\": \"BDB\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7344\",\n" +
            "                \"stockSymbol\": \"BED\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7064\",\n" +
            "                \"stockSymbol\": \"BKC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:4576\",\n" +
            "                \"stockSymbol\": \"BLF\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:79621\",\n" +
            "                \"stockSymbol\": \"BNA\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6386\",\n" +
            "                \"stockSymbol\": \"BPC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:13575\",\n" +
            "                \"stockSymbol\": \"BSC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:5704\",\n" +
            "                \"stockSymbol\": \"BST\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1064\",\n" +
            "                \"stockSymbol\": \"BTS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:54585\",\n" +
            "                \"stockSymbol\": \"BTW\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1301\",\n" +
            "                \"stockSymbol\": \"BVS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7764\",\n" +
            "                \"stockSymbol\": \"BXH\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:75944\",\n" +
            "                \"stockSymbol\": \"C69\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76646\",\n" +
            "                \"stockSymbol\": \"CAG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6485\",\n" +
            "                \"stockSymbol\": \"CAN\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3524\",\n" +
            "                \"stockSymbol\": \"CAP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:73724\",\n" +
            "                \"stockSymbol\": \"CCR\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:74420\",\n" +
            "                \"stockSymbol\": \"CDN\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:72819\",\n" +
            "                \"stockSymbol\": \"CEO\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76339\",\n" +
            "                \"stockSymbol\": \"CET\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76740\",\n" +
            "                \"stockSymbol\": \"CIA\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1161\",\n" +
            "                \"stockSymbol\": \"CJC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8064\",\n" +
            "                \"stockSymbol\": \"CKV\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:74679\",\n" +
            "                \"stockSymbol\": \"CLH\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:74499\",\n" +
            "                \"stockSymbol\": \"CLM\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1202\",\n" +
            "                \"stockSymbol\": \"CMC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:14256\",\n" +
            "                \"stockSymbol\": \"CMS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8304\",\n" +
            "                \"stockSymbol\": \"CPC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7604\",\n" +
            "                \"stockSymbol\": \"CSC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:702\",\n" +
            "                \"stockSymbol\": \"CTB\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:4704\",\n" +
            "                \"stockSymbol\": \"CTC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:74879\",\n" +
            "                \"stockSymbol\": \"CTP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:73519\",\n" +
            "                \"stockSymbol\": \"CTT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:18196\",\n" +
            "                \"stockSymbol\": \"CTX\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:10332\",\n" +
            "                \"stockSymbol\": \"CVN\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8644\",\n" +
            "                \"stockSymbol\": \"CX8\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:14896\",\n" +
            "                \"stockSymbol\": \"D11\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7084\",\n" +
            "                \"stockSymbol\": \"DAD\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1461\",\n" +
            "                \"stockSymbol\": \"DAE\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:11832\",\n" +
            "                \"stockSymbol\": \"DC2\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:77940\",\n" +
            "                \"stockSymbol\": \"DDG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:20856\",\n" +
            "                \"stockSymbol\": \"DHP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:5484\",\n" +
            "                \"stockSymbol\": \"DHT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:15196\",\n" +
            "                \"stockSymbol\": \"DIH\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8324\",\n" +
            "                \"stockSymbol\": \"DL1\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7864\",\n" +
            "                \"stockSymbol\": \"DNC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6664\",\n" +
            "                \"stockSymbol\": \"DNP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:73499\",\n" +
            "                \"stockSymbol\": \"DP3\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6484\",\n" +
            "                \"stockSymbol\": \"DPC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76419\",\n" +
            "                \"stockSymbol\": \"DS3\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:2824\",\n" +
            "                \"stockSymbol\": \"DST\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:71837\",\n" +
            "                \"stockSymbol\": \"DTC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76662\",\n" +
            "                \"stockSymbol\": \"DTD\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:75686\",\n" +
            "                \"stockSymbol\": \"DTG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:75420\",\n" +
            "                \"stockSymbol\": \"DTK\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:79841\",\n" +
            "                \"stockSymbol\": \"DVG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:81184\",\n" +
            "                \"stockSymbol\": \"DVM\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:81\",\n" +
            "                \"stockSymbol\": \"DXP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6364\",\n" +
            "                \"stockSymbol\": \"DZM\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1281\",\n" +
            "                \"stockSymbol\": \"EBS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6344\",\n" +
            "                \"stockSymbol\": \"ECI\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6924\",\n" +
            "                \"stockSymbol\": \"EID\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:77579\",\n" +
            "                \"stockSymbol\": \"EVS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:73379\",\n" +
            "                \"stockSymbol\": \"FID\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:54904\",\n" +
            "                \"stockSymbol\": \"GDW\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:79701\",\n" +
            "                \"stockSymbol\": \"GIC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76302\",\n" +
            "                \"stockSymbol\": \"GKM\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7804\",\n" +
            "                \"stockSymbol\": \"GLT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:79721\",\n" +
            "                \"stockSymbol\": \"GMA\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:16476\",\n" +
            "                \"stockSymbol\": \"GMX\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7444\",\n" +
            "                \"stockSymbol\": \"HAD\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:13975\",\n" +
            "                \"stockSymbol\": \"HAT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:11672\",\n" +
            "                \"stockSymbol\": \"HBS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3365\",\n" +
            "                \"stockSymbol\": \"HCC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3064\",\n" +
            "                \"stockSymbol\": \"HCT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:14576\",\n" +
            "                \"stockSymbol\": \"HDA\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3264\",\n" +
            "                \"stockSymbol\": \"HEV\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7965\",\n" +
            "                \"stockSymbol\": \"HGM\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:2984\",\n" +
            "                \"stockSymbol\": \"HHC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1342\",\n" +
            "                \"stockSymbol\": \"HJS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:75525\",\n" +
            "                \"stockSymbol\": \"HKT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6204\",\n" +
            "                \"stockSymbol\": \"HLC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:20916\",\n" +
            "                \"stockSymbol\": \"HLD\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:12193\",\n" +
            "                \"stockSymbol\": \"HMH\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:80841\",\n" +
            "                \"stockSymbol\": \"HMR\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6724\",\n" +
            "                \"stockSymbol\": \"HOM\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8884\",\n" +
            "                \"stockSymbol\": \"HTC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1201\",\n" +
            "                \"stockSymbol\": \"HTP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:4204\",\n" +
            "                \"stockSymbol\": \"HUT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6264\",\n" +
            "                \"stockSymbol\": \"HVT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6244\",\n" +
            "                \"stockSymbol\": \"ICG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76739\",\n" +
            "                \"stockSymbol\": \"IDC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:13032\",\n" +
            "                \"stockSymbol\": \"IDJ\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:9444\",\n" +
            "                \"stockSymbol\": \"IDV\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:16836\",\n" +
            "                \"stockSymbol\": \"INC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8264\",\n" +
            "                \"stockSymbol\": \"INN\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:74719\",\n" +
            "                \"stockSymbol\": \"IPA\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:18716\",\n" +
            "                \"stockSymbol\": \"ITQ\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:16616\",\n" +
            "                \"stockSymbol\": \"IVS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:74401\",\n" +
            "                \"stockSymbol\": \"KDM\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76821\",\n" +
            "                \"stockSymbol\": \"KHS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:4864\",\n" +
            "                \"stockSymbol\": \"KKC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:72339\",\n" +
            "                \"stockSymbol\": \"KLF\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:14636\",\n" +
            "                \"stockSymbol\": \"KMT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:9084\",\n" +
            "                \"stockSymbol\": \"KSD\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:80521\",\n" +
            "                \"stockSymbol\": \"KSF\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:22357\",\n" +
            "                \"stockSymbol\": \"KSQ\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:12892\",\n" +
            "                \"stockSymbol\": \"KST\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:74860\",\n" +
            "                \"stockSymbol\": \"KSV\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:14856\",\n" +
            "                \"stockSymbol\": \"KTS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:13695\",\n" +
            "                \"stockSymbol\": \"KTT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:16676\",\n" +
            "                \"stockSymbol\": \"L14\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:4184\",\n" +
            "                \"stockSymbol\": \"L18\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:79882\",\n" +
            "                \"stockSymbol\": \"L40\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:4224\",\n" +
            "                \"stockSymbol\": \"L43\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:5264\",\n" +
            "                \"stockSymbol\": \"L61\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:4125\",\n" +
            "                \"stockSymbol\": \"L62\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:17996\",\n" +
            "                \"stockSymbol\": \"LAS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3804\",\n" +
            "                \"stockSymbol\": \"LBE\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:13595\",\n" +
            "                \"stockSymbol\": \"LCD\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:11072\",\n" +
            "                \"stockSymbol\": \"LDP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8224\",\n" +
            "                \"stockSymbol\": \"LHC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8824\",\n" +
            "                \"stockSymbol\": \"LIG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8024\",\n" +
            "                \"stockSymbol\": \"MAC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:54124\",\n" +
            "                \"stockSymbol\": \"MAS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:74019\",\n" +
            "                \"stockSymbol\": \"MBG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:74399\",\n" +
            "                \"stockSymbol\": \"MBS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8784\",\n" +
            "                \"stockSymbol\": \"MCC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:15056\",\n" +
            "                \"stockSymbol\": \"MCF\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1082\",\n" +
            "                \"stockSymbol\": \"MCO\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6684\",\n" +
            "                \"stockSymbol\": \"MDC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:79181\",\n" +
            "                \"stockSymbol\": \"MED\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76522\",\n" +
            "                \"stockSymbol\": \"MEL\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7824\",\n" +
            "                \"stockSymbol\": \"MHL\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:12612\",\n" +
            "                \"stockSymbol\": \"MIM\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:5564\",\n" +
            "                \"stockSymbol\": \"MKV\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:74539\",\n" +
            "                \"stockSymbol\": \"MST\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:75139\",\n" +
            "                \"stockSymbol\": \"MVB\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7144\",\n" +
            "                \"stockSymbol\": \"NAG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:74821\",\n" +
            "                \"stockSymbol\": \"NAP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1721\",\n" +
            "                \"stockSymbol\": \"NBC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6844\",\n" +
            "                \"stockSymbol\": \"NBP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:54744\",\n" +
            "                \"stockSymbol\": \"NBW\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:15716\",\n" +
            "                \"stockSymbol\": \"NDN\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:22319\",\n" +
            "                \"stockSymbol\": \"NDX\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:12713\",\n" +
            "                \"stockSymbol\": \"NET\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:72519\",\n" +
            "                \"stockSymbol\": \"NFC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6564\",\n" +
            "                \"stockSymbol\": \"NHC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:77079\",\n" +
            "                \"stockSymbol\": \"NRC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76287\",\n" +
            "                \"stockSymbol\": \"NSH\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1762\",\n" +
            "                \"stockSymbol\": \"NST\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:78460\",\n" +
            "                \"stockSymbol\": \"NTH\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1181\",\n" +
            "                \"stockSymbol\": \"NTP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:12072\",\n" +
            "                \"stockSymbol\": \"NVB\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:13415\",\n" +
            "                \"stockSymbol\": \"OCH\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:4664\",\n" +
            "                \"stockSymbol\": \"ONE\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:73140\",\n" +
            "                \"stockSymbol\": \"PBP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:73521\",\n" +
            "                \"stockSymbol\": \"PCE\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:14816\",\n" +
            "                \"stockSymbol\": \"PCG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:81243\",\n" +
            "                \"stockSymbol\": \"PCH\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:17216\",\n" +
            "                \"stockSymbol\": \"PCT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:73599\",\n" +
            "                \"stockSymbol\": \"PDB\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:72800\",\n" +
            "                \"stockSymbol\": \"PEN\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:78521\",\n" +
            "                \"stockSymbol\": \"PGN\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3024\",\n" +
            "                \"stockSymbol\": \"PGS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8025\",\n" +
            "                \"stockSymbol\": \"PGT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:78199\",\n" +
            "                \"stockSymbol\": \"PHN\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:75683\",\n" +
            "                \"stockSymbol\": \"PIA\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:73579\",\n" +
            "                \"stockSymbol\": \"PIC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1601\",\n" +
            "                \"stockSymbol\": \"PJC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1502\",\n" +
            "                \"stockSymbol\": \"PLC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:73760\",\n" +
            "                \"stockSymbol\": \"PMB\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7284\",\n" +
            "                \"stockSymbol\": \"PMC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:73740\",\n" +
            "                \"stockSymbol\": \"PMP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6387\",\n" +
            "                \"stockSymbol\": \"PMS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1362\",\n" +
            "                \"stockSymbol\": \"POT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:16636\",\n" +
            "                \"stockSymbol\": \"PPE\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:16896\",\n" +
            "                \"stockSymbol\": \"PPP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:14916\",\n" +
            "                \"stockSymbol\": \"PPS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:81102\",\n" +
            "                \"stockSymbol\": \"PPT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:74321\",\n" +
            "                \"stockSymbol\": \"PPY\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:14081\",\n" +
            "                \"stockSymbol\": \"PRC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:79782\",\n" +
            "                \"stockSymbol\": \"PRE\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1681\",\n" +
            "                \"stockSymbol\": \"PSC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:22297\",\n" +
            "                \"stockSymbol\": \"PSD\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:73219\",\n" +
            "                \"stockSymbol\": \"PSE\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:12092\",\n" +
            "                \"stockSymbol\": \"PSI\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:73480\",\n" +
            "                \"stockSymbol\": \"PSW\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:60792\",\n" +
            "                \"stockSymbol\": \"PTD\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:14556\",\n" +
            "                \"stockSymbol\": \"PTI\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:962\",\n" +
            "                \"stockSymbol\": \"PTS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:14416\",\n" +
            "                \"stockSymbol\": \"PV2\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:72460\",\n" +
            "                \"stockSymbol\": \"PVB\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3004\",\n" +
            "                \"stockSymbol\": \"PVC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:5904\",\n" +
            "                \"stockSymbol\": \"PVG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:2624\",\n" +
            "                \"stockSymbol\": \"PVI\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:2724\",\n" +
            "                \"stockSymbol\": \"PVS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8504\",\n" +
            "                \"stockSymbol\": \"QHD\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:5664\",\n" +
            "                \"stockSymbol\": \"QST\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:5984\",\n" +
            "                \"stockSymbol\": \"QTC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:2242\",\n" +
            "                \"stockSymbol\": \"RCL\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1503\",\n" +
            "                \"stockSymbol\": \"S55\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1521\",\n" +
            "                \"stockSymbol\": \"S99\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6424\",\n" +
            "                \"stockSymbol\": \"SAF\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:79982\",\n" +
            "                \"stockSymbol\": \"SCG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:72659\",\n" +
            "                \"stockSymbol\": \"SCI\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1703\",\n" +
            "                \"stockSymbol\": \"SD5\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1561\",\n" +
            "                \"stockSymbol\": \"SD6\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1402\",\n" +
            "                \"stockSymbol\": \"SD9\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1403\",\n" +
            "                \"stockSymbol\": \"SDA\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1603\",\n" +
            "                \"stockSymbol\": \"SDC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8065\",\n" +
            "                \"stockSymbol\": \"SDG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6624\",\n" +
            "                \"stockSymbol\": \"SDN\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1262\",\n" +
            "                \"stockSymbol\": \"SDT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7204\",\n" +
            "                \"stockSymbol\": \"SDU\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6045\",\n" +
            "                \"stockSymbol\": \"SEB\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7004\",\n" +
            "                \"stockSymbol\": \"SED\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6524\",\n" +
            "                \"stockSymbol\": \"SFN\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6584\",\n" +
            "                \"stockSymbol\": \"SGC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1682\",\n" +
            "                \"stockSymbol\": \"SGD\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6944\",\n" +
            "                \"stockSymbol\": \"SGH\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:78100\",\n" +
            "                \"stockSymbol\": \"SHE\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8044\",\n" +
            "                \"stockSymbol\": \"SHN\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6604\",\n" +
            "                \"stockSymbol\": \"SHS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6444\",\n" +
            "                \"stockSymbol\": \"SJ1\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1261\",\n" +
            "                \"stockSymbol\": \"SJE\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:19696\",\n" +
            "                \"stockSymbol\": \"SLS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:73481\",\n" +
            "                \"stockSymbol\": \"SMN\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:9504\",\n" +
            "                \"stockSymbol\": \"SMT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:55324\",\n" +
            "                \"stockSymbol\": \"SPC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:19316\",\n" +
            "                \"stockSymbol\": \"SPI\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3704\",\n" +
            "                \"stockSymbol\": \"SRA\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:5425\",\n" +
            "                \"stockSymbol\": \"SSM\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1541\",\n" +
            "                \"stockSymbol\": \"STC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:742\",\n" +
            "                \"stockSymbol\": \"STP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:16957\",\n" +
            "                \"stockSymbol\": \"SVN\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:78961\",\n" +
            "                \"stockSymbol\": \"SZB\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:73559\",\n" +
            "                \"stockSymbol\": \"TA9\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:78140\",\n" +
            "                \"stockSymbol\": \"TAR\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:5224\",\n" +
            "                \"stockSymbol\": \"TBX\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:4126\",\n" +
            "                \"stockSymbol\": \"TC6\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:5424\",\n" +
            "                \"stockSymbol\": \"TDN\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:77519\",\n" +
            "                \"stockSymbol\": \"TDT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8944\",\n" +
            "                \"stockSymbol\": \"TET\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:74021\",\n" +
            "                \"stockSymbol\": \"TFC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:5404\",\n" +
            "                \"stockSymbol\": \"THB\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:79421\",\n" +
            "                \"stockSymbol\": \"THD\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:72419\",\n" +
            "                \"stockSymbol\": \"THS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:5284\",\n" +
            "                \"stockSymbol\": \"THT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:13495\",\n" +
            "                \"stockSymbol\": \"TIG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3364\",\n" +
            "                \"stockSymbol\": \"TJC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7844\",\n" +
            "                \"stockSymbol\": \"TKC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:79981\",\n" +
            "                \"stockSymbol\": \"TKG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:261\",\n" +
            "                \"stockSymbol\": \"TKU\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:75542\",\n" +
            "                \"stockSymbol\": \"TMB\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6404\",\n" +
            "                \"stockSymbol\": \"TMC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7424\",\n" +
            "                \"stockSymbol\": \"TMX\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3104\",\n" +
            "                \"stockSymbol\": \"TNG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76282\",\n" +
            "                \"stockSymbol\": \"TOT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1341\",\n" +
            "                \"stockSymbol\": \"TPH\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:4784\",\n" +
            "                \"stockSymbol\": \"TPP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:14976\",\n" +
            "                \"stockSymbol\": \"TSB\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8244\",\n" +
            "                \"stockSymbol\": \"TTC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:75179\",\n" +
            "                \"stockSymbol\": \"TTH\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76879\",\n" +
            "                \"stockSymbol\": \"TTL\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76081\",\n" +
            "                \"stockSymbol\": \"TTT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:20036\",\n" +
            "                \"stockSymbol\": \"TTZ\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7784\",\n" +
            "                \"stockSymbol\": \"TV3\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:4284\",\n" +
            "                \"stockSymbol\": \"TV4\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:72783\",\n" +
            "                \"stockSymbol\": \"TVC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:14776\",\n" +
            "                \"stockSymbol\": \"TVD\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1141\",\n" +
            "                \"stockSymbol\": \"TXM\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6405\",\n" +
            "                \"stockSymbol\": \"UNI\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7704\",\n" +
            "                \"stockSymbol\": \"V12\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8664\",\n" +
            "                \"stockSymbol\": \"V21\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:8384\",\n" +
            "                \"stockSymbol\": \"VBC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6304\",\n" +
            "                \"stockSymbol\": \"VC1\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1101\",\n" +
            "                \"stockSymbol\": \"VC2\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3304\",\n" +
            "                \"stockSymbol\": \"VC3\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3784\",\n" +
            "                \"stockSymbol\": \"VC6\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3546\",\n" +
            "                \"stockSymbol\": \"VC7\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7184\",\n" +
            "                \"stockSymbol\": \"VC9\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:5964\",\n" +
            "                \"stockSymbol\": \"VCC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:9264\",\n" +
            "                \"stockSymbol\": \"VCM\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:3284\",\n" +
            "                \"stockSymbol\": \"VCS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:2864\",\n" +
            "                \"stockSymbol\": \"VDL\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:4844\",\n" +
            "                \"stockSymbol\": \"VE1\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:11732\",\n" +
            "                \"stockSymbol\": \"VE2\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:10050\",\n" +
            "                \"stockSymbol\": \"VE3\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:19637\",\n" +
            "                \"stockSymbol\": \"VE4\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:19416\",\n" +
            "                \"stockSymbol\": \"VE8\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:79422\",\n" +
            "                \"stockSymbol\": \"VFS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6464\",\n" +
            "                \"stockSymbol\": \"VGP\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:5584\",\n" +
            "                \"stockSymbol\": \"VGS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:78059\",\n" +
            "                \"stockSymbol\": \"VHE\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:5725\",\n" +
            "                \"stockSymbol\": \"VHL\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:75522\",\n" +
            "                \"stockSymbol\": \"VIF\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7884\",\n" +
            "                \"stockSymbol\": \"VIG\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7624\",\n" +
            "                \"stockSymbol\": \"VIT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:11692\",\n" +
            "                \"stockSymbol\": \"VLA\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1083\",\n" +
            "                \"stockSymbol\": \"VMC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:73820\",\n" +
            "                \"stockSymbol\": \"VMS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1481\",\n" +
            "                \"stockSymbol\": \"VNC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:13132\",\n" +
            "                \"stockSymbol\": \"VNF\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:141\",\n" +
            "                \"stockSymbol\": \"VNR\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7024\",\n" +
            "                \"stockSymbol\": \"VNT\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:74104\",\n" +
            "                \"stockSymbol\": \"VSA\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76239\",\n" +
            "                \"stockSymbol\": \"VSM\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:6388\",\n" +
            "                \"stockSymbol\": \"VTC\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:72919\",\n" +
            "                \"stockSymbol\": \"VTH\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:73079\",\n" +
            "                \"stockSymbol\": \"VTJ\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:1241\",\n" +
            "                \"stockSymbol\": \"VTV\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:80563\",\n" +
            "                \"stockSymbol\": \"VTZ\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:11272\",\n" +
            "                \"stockSymbol\": \"WCS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:7984\",\n" +
            "                \"stockSymbol\": \"WSS\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"hnx:76939\",\n" +
            "                \"stockSymbol\": \"X20\",\n" +
            "                \"exchange\": \"hnx\"\n" +
            "            }\n" +
            "        ]";

    String str4 = "[\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77800\",\n" +
            "                \"stockSymbol\": \"A32\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79481\",\n" +
            "                \"stockSymbol\": \"AAS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79784\",\n" +
            "                \"stockSymbol\": \"ABB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74941\",\n" +
            "                \"stockSymbol\": \"ABC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54064\",\n" +
            "                \"stockSymbol\": \"ABI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81681\",\n" +
            "                \"stockSymbol\": \"ABW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54244\",\n" +
            "                \"stockSymbol\": \"ACE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73539\",\n" +
            "                \"stockSymbol\": \"ACM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76281\",\n" +
            "                \"stockSymbol\": \"ACS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75320\",\n" +
            "                \"stockSymbol\": \"ACV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75301\",\n" +
            "                \"stockSymbol\": \"AFX\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76851\",\n" +
            "                \"stockSymbol\": \"AG1\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81281\",\n" +
            "                \"stockSymbol\": \"AGE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79142\",\n" +
            "                \"stockSymbol\": \"AGF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73759\",\n" +
            "                \"stockSymbol\": \"AGP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73680\",\n" +
            "                \"stockSymbol\": \"AGX\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79821\",\n" +
            "                \"stockSymbol\": \"AIC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:12732\",\n" +
            "                \"stockSymbol\": \"ALV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72979\",\n" +
            "                \"stockSymbol\": \"AMD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75541\",\n" +
            "                \"stockSymbol\": \"AMP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75639\",\n" +
            "                \"stockSymbol\": \"AMS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75408\",\n" +
            "                \"stockSymbol\": \"ANT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76120\",\n" +
            "                \"stockSymbol\": \"APF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75120\",\n" +
            "                \"stockSymbol\": \"APL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:13414\",\n" +
            "                \"stockSymbol\": \"APP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78379\",\n" +
            "                \"stockSymbol\": \"APT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76361\",\n" +
            "                \"stockSymbol\": \"ART\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:17796\",\n" +
            "                \"stockSymbol\": \"ASA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75662\",\n" +
            "                \"stockSymbol\": \"ATA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76480\",\n" +
            "                \"stockSymbol\": \"ATB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80161\",\n" +
            "                \"stockSymbol\": \"ATG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76859\",\n" +
            "                \"stockSymbol\": \"AVC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73459\",\n" +
            "                \"stockSymbol\": \"AVF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:4044\",\n" +
            "                \"stockSymbol\": \"B82\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76863\",\n" +
            "                \"stockSymbol\": \"BAL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79321\",\n" +
            "                \"stockSymbol\": \"BBH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76826\",\n" +
            "                \"stockSymbol\": \"BBM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77321\",\n" +
            "                \"stockSymbol\": \"BBT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80461\",\n" +
            "                \"stockSymbol\": \"BCA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77840\",\n" +
            "                \"stockSymbol\": \"BCB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73699\",\n" +
            "                \"stockSymbol\": \"BCP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79901\",\n" +
            "                \"stockSymbol\": \"BCV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74443\",\n" +
            "                \"stockSymbol\": \"BDG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76499\",\n" +
            "                \"stockSymbol\": \"BDT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73779\",\n" +
            "                \"stockSymbol\": \"BDW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74799\",\n" +
            "                \"stockSymbol\": \"BEL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76641\",\n" +
            "                \"stockSymbol\": \"BGW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76360\",\n" +
            "                \"stockSymbol\": \"BHA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:6324\",\n" +
            "                \"stockSymbol\": \"BHC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77839\",\n" +
            "                \"stockSymbol\": \"BHG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81821\",\n" +
            "                \"stockSymbol\": \"BHI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77119\",\n" +
            "                \"stockSymbol\": \"BHK\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:71236\",\n" +
            "                \"stockSymbol\": \"BHP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80822\",\n" +
            "                \"stockSymbol\": \"BIG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72781\",\n" +
            "                \"stockSymbol\": \"BII\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77699\",\n" +
            "                \"stockSymbol\": \"BIO\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74080\",\n" +
            "                \"stockSymbol\": \"BLI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74979\",\n" +
            "                \"stockSymbol\": \"BLN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76279\",\n" +
            "                \"stockSymbol\": \"BLT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77819\",\n" +
            "                \"stockSymbol\": \"BLW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76102\",\n" +
            "                \"stockSymbol\": \"BMD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77140\",\n" +
            "                \"stockSymbol\": \"BMF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77999\",\n" +
            "                \"stockSymbol\": \"BMG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54325\",\n" +
            "                \"stockSymbol\": \"BMJ\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74441\",\n" +
            "                \"stockSymbol\": \"BMN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77639\",\n" +
            "                \"stockSymbol\": \"BMS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76100\",\n" +
            "                \"stockSymbol\": \"BMV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78019\",\n" +
            "                \"stockSymbol\": \"BNW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78159\",\n" +
            "                \"stockSymbol\": \"BOT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76845\",\n" +
            "                \"stockSymbol\": \"BQB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76160\",\n" +
            "                \"stockSymbol\": \"BRR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75582\",\n" +
            "                \"stockSymbol\": \"BRS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77679\",\n" +
            "                \"stockSymbol\": \"BSA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75999\",\n" +
            "                \"stockSymbol\": \"BSD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75299\",\n" +
            "                \"stockSymbol\": \"BSG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77461\",\n" +
            "                \"stockSymbol\": \"BSH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76103\",\n" +
            "                \"stockSymbol\": \"BSL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74899\",\n" +
            "                \"stockSymbol\": \"BSP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75699\",\n" +
            "                \"stockSymbol\": \"BSQ\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76999\",\n" +
            "                \"stockSymbol\": \"BSR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75219\",\n" +
            "                \"stockSymbol\": \"BT1\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75719\",\n" +
            "                \"stockSymbol\": \"BT6\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75519\",\n" +
            "                \"stockSymbol\": \"BTB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75700\",\n" +
            "                \"stockSymbol\": \"BTD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54805\",\n" +
            "                \"stockSymbol\": \"BTG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3547\",\n" +
            "                \"stockSymbol\": \"BTH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76828\",\n" +
            "                \"stockSymbol\": \"BTN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74340\",\n" +
            "                \"stockSymbol\": \"BTU\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75669\",\n" +
            "                \"stockSymbol\": \"BTV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79441\",\n" +
            "                \"stockSymbol\": \"BVB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:12532\",\n" +
            "                \"stockSymbol\": \"BVG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80281\",\n" +
            "                \"stockSymbol\": \"BVL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:62572\",\n" +
            "                \"stockSymbol\": \"BVN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54925\",\n" +
            "                \"stockSymbol\": \"BWA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76721\",\n" +
            "                \"stockSymbol\": \"BWS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75413\",\n" +
            "                \"stockSymbol\": \"C12\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75180\",\n" +
            "                \"stockSymbol\": \"C21\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77259\",\n" +
            "                \"stockSymbol\": \"C22\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77939\",\n" +
            "                \"stockSymbol\": \"C4G\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3044\",\n" +
            "                \"stockSymbol\": \"C92\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78719\",\n" +
            "                \"stockSymbol\": \"CAB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:69076\",\n" +
            "                \"stockSymbol\": \"CAD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81161\",\n" +
            "                \"stockSymbol\": \"CAR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77061\",\n" +
            "                \"stockSymbol\": \"CAT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76525\",\n" +
            "                \"stockSymbol\": \"CBI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76162\",\n" +
            "                \"stockSymbol\": \"CBS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76285\",\n" +
            "                \"stockSymbol\": \"CC1\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76325\",\n" +
            "                \"stockSymbol\": \"CC4\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78963\",\n" +
            "                \"stockSymbol\": \"CCA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:5044\",\n" +
            "                \"stockSymbol\": \"CCM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75760\",\n" +
            "                \"stockSymbol\": \"CCP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76260\",\n" +
            "                \"stockSymbol\": \"CCT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75505\",\n" +
            "                \"stockSymbol\": \"CCV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75666\",\n" +
            "                \"stockSymbol\": \"CDG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74739\",\n" +
            "                \"stockSymbol\": \"CDH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77762\",\n" +
            "                \"stockSymbol\": \"CDO\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77499\",\n" +
            "                \"stockSymbol\": \"CDP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76182\",\n" +
            "                \"stockSymbol\": \"CDR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75879\",\n" +
            "                \"stockSymbol\": \"CE1\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76060\",\n" +
            "                \"stockSymbol\": \"CEG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77341\",\n" +
            "                \"stockSymbol\": \"CEN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79881\",\n" +
            "                \"stockSymbol\": \"CFM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78360\",\n" +
            "                \"stockSymbol\": \"CFV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76199\",\n" +
            "                \"stockSymbol\": \"CGV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76122\",\n" +
            "                \"stockSymbol\": \"CH5\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75659\",\n" +
            "                \"stockSymbol\": \"CHC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75526\",\n" +
            "                \"stockSymbol\": \"CHS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:65096\",\n" +
            "                \"stockSymbol\": \"CI5\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:9\",\n" +
            "                \"stockSymbol\": \"CID\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76524\",\n" +
            "                \"stockSymbol\": \"CIP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81524\",\n" +
            "                \"stockSymbol\": \"CK8\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77765\",\n" +
            "                \"stockSymbol\": \"CKA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73380\",\n" +
            "                \"stockSymbol\": \"CKD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80081\",\n" +
            "                \"stockSymbol\": \"CLG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75720\",\n" +
            "                \"stockSymbol\": \"CLX\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78523\",\n" +
            "                \"stockSymbol\": \"CMD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75341\",\n" +
            "                \"stockSymbol\": \"CMF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:11552\",\n" +
            "                \"stockSymbol\": \"CMI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73839\",\n" +
            "                \"stockSymbol\": \"CMK\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81421\",\n" +
            "                \"stockSymbol\": \"CMM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76280\",\n" +
            "                \"stockSymbol\": \"CMN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74279\",\n" +
            "                \"stockSymbol\": \"CMP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78279\",\n" +
            "                \"stockSymbol\": \"CMT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75899\",\n" +
            "                \"stockSymbol\": \"CMW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80641\",\n" +
            "                \"stockSymbol\": \"CNA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72639\",\n" +
            "                \"stockSymbol\": \"CNC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74660\",\n" +
            "                \"stockSymbol\": \"CNN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73203\",\n" +
            "                \"stockSymbol\": \"CNT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78981\",\n" +
            "                \"stockSymbol\": \"CPA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75622\",\n" +
            "                \"stockSymbol\": \"CPH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76322\",\n" +
            "                \"stockSymbol\": \"CPI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79541\",\n" +
            "                \"stockSymbol\": \"CQN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75222\",\n" +
            "                \"stockSymbol\": \"CQT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78239\",\n" +
            "                \"stockSymbol\": \"CSI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80062\",\n" +
            "                \"stockSymbol\": \"CST\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54245\",\n" +
            "                \"stockSymbol\": \"CT3\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:8984\",\n" +
            "                \"stockSymbol\": \"CT6\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:13294\",\n" +
            "                \"stockSymbol\": \"CTA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:1401\",\n" +
            "                \"stockSymbol\": \"CTN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75060\",\n" +
            "                \"stockSymbol\": \"CTW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76063\",\n" +
            "                \"stockSymbol\": \"CYC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:642\",\n" +
            "                \"stockSymbol\": \"DAC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80661\",\n" +
            "                \"stockSymbol\": \"DAN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72780\",\n" +
            "                \"stockSymbol\": \"DAS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54384\",\n" +
            "                \"stockSymbol\": \"DBM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74839\",\n" +
            "                \"stockSymbol\": \"DC1\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75540\",\n" +
            "                \"stockSymbol\": \"DCF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77941\",\n" +
            "                \"stockSymbol\": \"DCG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77180\",\n" +
            "                \"stockSymbol\": \"DCH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77779\",\n" +
            "                \"stockSymbol\": \"DCR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3344\",\n" +
            "                \"stockSymbol\": \"DCS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74445\",\n" +
            "                \"stockSymbol\": \"DCT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74779\",\n" +
            "                \"stockSymbol\": \"DDH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73059\",\n" +
            "                \"stockSymbol\": \"DDM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54046\",\n" +
            "                \"stockSymbol\": \"DDN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73441\",\n" +
            "                \"stockSymbol\": \"DDV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75520\",\n" +
            "                \"stockSymbol\": \"DFC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80322\",\n" +
            "                \"stockSymbol\": \"DFF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54485\",\n" +
            "                \"stockSymbol\": \"DGT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76323\",\n" +
            "                \"stockSymbol\": \"DHB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76019\",\n" +
            "                \"stockSymbol\": \"DHD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77159\",\n" +
            "                \"stockSymbol\": \"DHN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79521\",\n" +
            "                \"stockSymbol\": \"DIC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:7964\",\n" +
            "                \"stockSymbol\": \"DID\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79461\",\n" +
            "                \"stockSymbol\": \"DKC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:62992\",\n" +
            "                \"stockSymbol\": \"DLD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81523\",\n" +
            "                \"stockSymbol\": \"DLM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:9104\",\n" +
            "                \"stockSymbol\": \"DLR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73939\",\n" +
            "                \"stockSymbol\": \"DLT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77763\",\n" +
            "                \"stockSymbol\": \"DM7\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80562\",\n" +
            "                \"stockSymbol\": \"DMN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81741\",\n" +
            "                \"stockSymbol\": \"DMS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76639\",\n" +
            "                \"stockSymbol\": \"DNA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75241\",\n" +
            "                \"stockSymbol\": \"DND\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75880\",\n" +
            "                \"stockSymbol\": \"DNE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76161\",\n" +
            "                \"stockSymbol\": \"DNH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:66156\",\n" +
            "                \"stockSymbol\": \"DNL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:14216\",\n" +
            "                \"stockSymbol\": \"DNM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76283\",\n" +
            "                \"stockSymbol\": \"DNN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54086\",\n" +
            "                \"stockSymbol\": \"DNT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74359\",\n" +
            "                \"stockSymbol\": \"DNW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75409\",\n" +
            "                \"stockSymbol\": \"DOC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73879\",\n" +
            "                \"stockSymbol\": \"DOP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77339\",\n" +
            "                \"stockSymbol\": \"DP1\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76061\",\n" +
            "                \"stockSymbol\": \"DP2\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75579\",\n" +
            "                \"stockSymbol\": \"DPH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:55084\",\n" +
            "                \"stockSymbol\": \"DPP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73359\",\n" +
            "                \"stockSymbol\": \"DPS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78921\",\n" +
            "                \"stockSymbol\": \"DRG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76062\",\n" +
            "                \"stockSymbol\": \"DRI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76862\",\n" +
            "                \"stockSymbol\": \"DSC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80962\",\n" +
            "                \"stockSymbol\": \"DSD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76380\",\n" +
            "                \"stockSymbol\": \"DSG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77764\",\n" +
            "                \"stockSymbol\": \"DSP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75359\",\n" +
            "                \"stockSymbol\": \"DSV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78619\",\n" +
            "                \"stockSymbol\": \"DTB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79785\",\n" +
            "                \"stockSymbol\": \"DTE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80901\",\n" +
            "                \"stockSymbol\": \"DTH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76843\",\n" +
            "                \"stockSymbol\": \"DTI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79401\",\n" +
            "                \"stockSymbol\": \"DTP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54787\",\n" +
            "                \"stockSymbol\": \"DTV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79043\",\n" +
            "                \"stockSymbol\": \"DUS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72439\",\n" +
            "                \"stockSymbol\": \"DVC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76022\",\n" +
            "                \"stockSymbol\": \"DVN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77299\",\n" +
            "                \"stockSymbol\": \"DVW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80681\",\n" +
            "                \"stockSymbol\": \"DWC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78099\",\n" +
            "                \"stockSymbol\": \"DWS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:55025\",\n" +
            "                \"stockSymbol\": \"DXL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79021\",\n" +
            "                \"stockSymbol\": \"E12\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78842\",\n" +
            "                \"stockSymbol\": \"E29\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:7264\",\n" +
            "                \"stockSymbol\": \"EFI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75670\",\n" +
            "                \"stockSymbol\": \"EIC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75743\",\n" +
            "                \"stockSymbol\": \"EIN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76304\",\n" +
            "                \"stockSymbol\": \"EME\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75663\",\n" +
            "                \"stockSymbol\": \"EMG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76827\",\n" +
            "                \"stockSymbol\": \"EMS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77760\",\n" +
            "                \"stockSymbol\": \"EPC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76819\",\n" +
            "                \"stockSymbol\": \"EPH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:64996\",\n" +
            "                \"stockSymbol\": \"FBA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76621\",\n" +
            "                \"stockSymbol\": \"FBC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74559\",\n" +
            "                \"stockSymbol\": \"FCC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75667\",\n" +
            "                \"stockSymbol\": \"FCS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77721\",\n" +
            "                \"stockSymbol\": \"FGL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76840\",\n" +
            "                \"stockSymbol\": \"FHN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77859\",\n" +
            "                \"stockSymbol\": \"FHS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77599\",\n" +
            "                \"stockSymbol\": \"FIC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:16996\",\n" +
            "                \"stockSymbol\": \"FLC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77959\",\n" +
            "                \"stockSymbol\": \"FOC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75487\",\n" +
            "                \"stockSymbol\": \"FOX\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77540\",\n" +
            "                \"stockSymbol\": \"FRC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76679\",\n" +
            "                \"stockSymbol\": \"FRM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75589\",\n" +
            "                \"stockSymbol\": \"FSO\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76523\",\n" +
            "                \"stockSymbol\": \"FT1\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76626\",\n" +
            "                \"stockSymbol\": \"FTI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81042\",\n" +
            "                \"stockSymbol\": \"FTM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73199\",\n" +
            "                \"stockSymbol\": \"G20\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75439\",\n" +
            "                \"stockSymbol\": \"G36\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81801\",\n" +
            "                \"stockSymbol\": \"GAB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75460\",\n" +
            "                \"stockSymbol\": \"GCB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81461\",\n" +
            "                \"stockSymbol\": \"GCF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80881\",\n" +
            "                \"stockSymbol\": \"GEE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:55364\",\n" +
            "                \"stockSymbol\": \"GER\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:7404\",\n" +
            "                \"stockSymbol\": \"GGG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80364\",\n" +
            "                \"stockSymbol\": \"GH3\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:64316\",\n" +
            "                \"stockSymbol\": \"GHC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78039\",\n" +
            "                \"stockSymbol\": \"GLC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76844\",\n" +
            "                \"stockSymbol\": \"GLW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75685\",\n" +
            "                \"stockSymbol\": \"GND\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81522\",\n" +
            "                \"stockSymbol\": \"GPC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73319\",\n" +
            "                \"stockSymbol\": \"GSM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75401\",\n" +
            "                \"stockSymbol\": \"GTD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75162\",\n" +
            "                \"stockSymbol\": \"GTS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74661\",\n" +
            "                \"stockSymbol\": \"GTT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75521\",\n" +
            "                \"stockSymbol\": \"GVT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:64616\",\n" +
            "                \"stockSymbol\": \"H11\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75121\",\n" +
            "                \"stockSymbol\": \"HAC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76320\",\n" +
            "                \"stockSymbol\": \"HAF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81561\",\n" +
            "                \"stockSymbol\": \"HAI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76403\",\n" +
            "                \"stockSymbol\": \"HAM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75160\",\n" +
            "                \"stockSymbol\": \"HAN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76723\",\n" +
            "                \"stockSymbol\": \"HAV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72319\",\n" +
            "                \"stockSymbol\": \"HBD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76379\",\n" +
            "                \"stockSymbol\": \"HBH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79024\",\n" +
            "                \"stockSymbol\": \"HC1\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76299\",\n" +
            "                \"stockSymbol\": \"HC3\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78941\",\n" +
            "                \"stockSymbol\": \"HCB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:61292\",\n" +
            "                \"stockSymbol\": \"HCI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74579\",\n" +
            "                \"stockSymbol\": \"HD2\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79741\",\n" +
            "                \"stockSymbol\": \"HD6\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78219\",\n" +
            "                \"stockSymbol\": \"HD8\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54524\",\n" +
            "                \"stockSymbol\": \"HDM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:11352\",\n" +
            "                \"stockSymbol\": \"HDO\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75740\",\n" +
            "                \"stockSymbol\": \"HDP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76628\",\n" +
            "                \"stockSymbol\": \"HDW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75424\",\n" +
            "                \"stockSymbol\": \"HEC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76300\",\n" +
            "                \"stockSymbol\": \"HEJ\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75486\",\n" +
            "                \"stockSymbol\": \"HEM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76782\",\n" +
            "                \"stockSymbol\": \"HEP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75399\",\n" +
            "                \"stockSymbol\": \"HES\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75839\",\n" +
            "                \"stockSymbol\": \"HFB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54566\",\n" +
            "                \"stockSymbol\": \"HFC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:61073\",\n" +
            "                \"stockSymbol\": \"HFX\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79642\",\n" +
            "                \"stockSymbol\": \"HGT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75523\",\n" +
            "                \"stockSymbol\": \"HGW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:12292\",\n" +
            "                \"stockSymbol\": \"HHG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75423\",\n" +
            "                \"stockSymbol\": \"HHN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75664\",\n" +
            "                \"stockSymbol\": \"HHR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54044\",\n" +
            "                \"stockSymbol\": \"HIG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73819\",\n" +
            "                \"stockSymbol\": \"HJC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73279\",\n" +
            "                \"stockSymbol\": \"HKB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73239\",\n" +
            "                \"stockSymbol\": \"HLA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75620\",\n" +
            "                \"stockSymbol\": \"HLB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75302\",\n" +
            "                \"stockSymbol\": \"HLR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76619\",\n" +
            "                \"stockSymbol\": \"HLS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78965\",\n" +
            "                \"stockSymbol\": \"HLT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:1543\",\n" +
            "                \"stockSymbol\": \"HLY\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74981\",\n" +
            "                \"stockSymbol\": \"HMG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76079\",\n" +
            "                \"stockSymbol\": \"HMS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76580\",\n" +
            "                \"stockSymbol\": \"HNA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73822\",\n" +
            "                \"stockSymbol\": \"HNB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75099\",\n" +
            "                \"stockSymbol\": \"HND\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73899\",\n" +
            "                \"stockSymbol\": \"HNF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76759\",\n" +
            "                \"stockSymbol\": \"HNI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:1623\",\n" +
            "                \"stockSymbol\": \"HNM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75407\",\n" +
            "                \"stockSymbol\": \"HNP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77319\",\n" +
            "                \"stockSymbol\": \"HNR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81581\",\n" +
            "                \"stockSymbol\": \"HOT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:8524\",\n" +
            "                \"stockSymbol\": \"HPB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73439\",\n" +
            "                \"stockSymbol\": \"HPD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76839\",\n" +
            "                \"stockSymbol\": \"HPH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76560\",\n" +
            "                \"stockSymbol\": \"HPI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74219\",\n" +
            "                \"stockSymbol\": \"HPM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54544\",\n" +
            "                \"stockSymbol\": \"HPP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54504\",\n" +
            "                \"stockSymbol\": \"HPT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75319\",\n" +
            "                \"stockSymbol\": \"HPW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76630\",\n" +
            "                \"stockSymbol\": \"HRB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74982\",\n" +
            "                \"stockSymbol\": \"HRT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75585\",\n" +
            "                \"stockSymbol\": \"HSA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73360\",\n" +
            "                \"stockSymbol\": \"HSI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77160\",\n" +
            "                \"stockSymbol\": \"HSM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79221\",\n" +
            "                \"stockSymbol\": \"HSP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80061\",\n" +
            "                \"stockSymbol\": \"HSV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76319\",\n" +
            "                \"stockSymbol\": \"HTE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76101\",\n" +
            "                \"stockSymbol\": \"HTG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77219\",\n" +
            "                \"stockSymbol\": \"HTM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79403\",\n" +
            "                \"stockSymbol\": \"HTT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81622\",\n" +
            "                \"stockSymbol\": \"HU3\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74261\",\n" +
            "                \"stockSymbol\": \"HU4\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73979\",\n" +
            "                \"stockSymbol\": \"HU6\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76783\",\n" +
            "                \"stockSymbol\": \"HUG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73580\",\n" +
            "                \"stockSymbol\": \"HVA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79501\",\n" +
            "                \"stockSymbol\": \"HVG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77541\",\n" +
            "                \"stockSymbol\": \"HWS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78340\",\n" +
            "                \"stockSymbol\": \"IBD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74659\",\n" +
            "                \"stockSymbol\": \"ICC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78319\",\n" +
            "                \"stockSymbol\": \"ICF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54804\",\n" +
            "                \"stockSymbol\": \"ICI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73442\",\n" +
            "                \"stockSymbol\": \"ICN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79822\",\n" +
            "                \"stockSymbol\": \"IDP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75243\",\n" +
            "                \"stockSymbol\": \"IFS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54484\",\n" +
            "                \"stockSymbol\": \"IHK\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76741\",\n" +
            "                \"stockSymbol\": \"ILA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77659\",\n" +
            "                \"stockSymbol\": \"ILC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77040\",\n" +
            "                \"stockSymbol\": \"ILS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54284\",\n" +
            "                \"stockSymbol\": \"IME\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54964\",\n" +
            "                \"stockSymbol\": \"IN4\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76899\",\n" +
            "                \"stockSymbol\": \"IRC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73722\",\n" +
            "                \"stockSymbol\": \"ISG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73462\",\n" +
            "                \"stockSymbol\": \"ISH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75504\",\n" +
            "                \"stockSymbol\": \"IST\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74103\",\n" +
            "                \"stockSymbol\": \"ITS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76321\",\n" +
            "                \"stockSymbol\": \"JOS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78721\",\n" +
            "                \"stockSymbol\": \"KAC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74020\",\n" +
            "                \"stockSymbol\": \"KCB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:64156\",\n" +
            "                \"stockSymbol\": \"KCE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76521\",\n" +
            "                \"stockSymbol\": \"KGM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75425\",\n" +
            "                \"stockSymbol\": \"KHD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:17016\",\n" +
            "                \"stockSymbol\": \"KHL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75684\",\n" +
            "                \"stockSymbol\": \"KHW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74480\",\n" +
            "                \"stockSymbol\": \"KIP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76180\",\n" +
            "                \"stockSymbol\": \"KLB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78966\",\n" +
            "                \"stockSymbol\": \"KLM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78723\",\n" +
            "                \"stockSymbol\": \"KSH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77399\",\n" +
            "                \"stockSymbol\": \"KTC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73119\",\n" +
            "                \"stockSymbol\": \"KTL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73300\",\n" +
            "                \"stockSymbol\": \"KVC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75483\",\n" +
            "                \"stockSymbol\": \"L12\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:8364\",\n" +
            "                \"stockSymbol\": \"L35\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:8104\",\n" +
            "                \"stockSymbol\": \"L44\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75161\",\n" +
            "                \"stockSymbol\": \"L45\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75080\",\n" +
            "                \"stockSymbol\": \"L63\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73601\",\n" +
            "                \"stockSymbol\": \"LAI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74081\",\n" +
            "                \"stockSymbol\": \"LAW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76402\",\n" +
            "                \"stockSymbol\": \"LBC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54924\",\n" +
            "                \"stockSymbol\": \"LCC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81341\",\n" +
            "                \"stockSymbol\": \"LCM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:11612\",\n" +
            "                \"stockSymbol\": \"LCS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77039\",\n" +
            "                \"stockSymbol\": \"LDW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76784\",\n" +
            "                \"stockSymbol\": \"LG9\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78962\",\n" +
            "                \"stockSymbol\": \"LGM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76082\",\n" +
            "                \"stockSymbol\": \"LIC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:67556\",\n" +
            "                \"stockSymbol\": \"LKW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76384\",\n" +
            "                \"stockSymbol\": \"LLM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:7845\",\n" +
            "                \"stockSymbol\": \"LM3\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:13515\",\n" +
            "                \"stockSymbol\": \"LM7\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76520\",\n" +
            "                \"stockSymbol\": \"LMC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79402\",\n" +
            "                \"stockSymbol\": \"LMH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76288\",\n" +
            "                \"stockSymbol\": \"LMI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78519\",\n" +
            "                \"stockSymbol\": \"LNC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:8004\",\n" +
            "                \"stockSymbol\": \"LO5\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79961\",\n" +
            "                \"stockSymbol\": \"LPT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75221\",\n" +
            "                \"stockSymbol\": \"LQN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80961\",\n" +
            "                \"stockSymbol\": \"LSG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:1063\",\n" +
            "                \"stockSymbol\": \"LTC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76286\",\n" +
            "                \"stockSymbol\": \"LTG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3544\",\n" +
            "                \"stockSymbol\": \"LUT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76864\",\n" +
            "                \"stockSymbol\": \"M10\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79423\",\n" +
            "                \"stockSymbol\": \"MA1\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77761\",\n" +
            "                \"stockSymbol\": \"MBN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81401\",\n" +
            "                \"stockSymbol\": \"MCD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81661\",\n" +
            "                \"stockSymbol\": \"MCG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75503\",\n" +
            "                \"stockSymbol\": \"MCH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79781\",\n" +
            "                \"stockSymbol\": \"MCM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76850\",\n" +
            "                \"stockSymbol\": \"MDA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:55104\",\n" +
            "                \"stockSymbol\": \"MDF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:1264\",\n" +
            "                \"stockSymbol\": \"MEC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:64456\",\n" +
            "                \"stockSymbol\": \"MEF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75380\",\n" +
            "                \"stockSymbol\": \"MES\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78259\",\n" +
            "                \"stockSymbol\": \"MFS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74699\",\n" +
            "                \"stockSymbol\": \"MGC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76629\",\n" +
            "                \"stockSymbol\": \"MGG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80921\",\n" +
            "                \"stockSymbol\": \"MGR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75739\",\n" +
            "                \"stockSymbol\": \"MH3\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3424\",\n" +
            "                \"stockSymbol\": \"MIC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76799\",\n" +
            "                \"stockSymbol\": \"MIE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76919\",\n" +
            "                \"stockSymbol\": \"MKP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76024\",\n" +
            "                \"stockSymbol\": \"MLC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75459\",\n" +
            "                \"stockSymbol\": \"MLS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78922\",\n" +
            "                \"stockSymbol\": \"MML\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77199\",\n" +
            "                \"stockSymbol\": \"MNB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76383\",\n" +
            "                \"stockSymbol\": \"MND\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76602\",\n" +
            "                \"stockSymbol\": \"MPC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74239\",\n" +
            "                \"stockSymbol\": \"MPT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76021\",\n" +
            "                \"stockSymbol\": \"MPY\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76644\",\n" +
            "                \"stockSymbol\": \"MQB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77419\",\n" +
            "                \"stockSymbol\": \"MQN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76761\",\n" +
            "                \"stockSymbol\": \"MRF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73719\",\n" +
            "                \"stockSymbol\": \"MSR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73823\",\n" +
            "                \"stockSymbol\": \"MTA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79763\",\n" +
            "                \"stockSymbol\": \"MTB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:67136\",\n" +
            "                \"stockSymbol\": \"MTC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73461\",\n" +
            "                \"stockSymbol\": \"MTG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:62452\",\n" +
            "                \"stockSymbol\": \"MTH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74540\",\n" +
            "                \"stockSymbol\": \"MTL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:62792\",\n" +
            "                \"stockSymbol\": \"MTP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75979\",\n" +
            "                \"stockSymbol\": \"MTS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76401\",\n" +
            "                \"stockSymbol\": \"MTV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75799\",\n" +
            "                \"stockSymbol\": \"MVC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77782\",\n" +
            "                \"stockSymbol\": \"MVN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79622\",\n" +
            "                \"stockSymbol\": \"NAB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75780\",\n" +
            "                \"stockSymbol\": \"NAC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75588\",\n" +
            "                \"stockSymbol\": \"NAS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77420\",\n" +
            "                \"stockSymbol\": \"NAU\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76359\",\n" +
            "                \"stockSymbol\": \"NAW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76420\",\n" +
            "                \"stockSymbol\": \"NBE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74639\",\n" +
            "                \"stockSymbol\": \"NBT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74039\",\n" +
            "                \"stockSymbol\": \"NCS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:62152\",\n" +
            "                \"stockSymbol\": \"ND2\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54765\",\n" +
            "                \"stockSymbol\": \"NDC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72779\",\n" +
            "                \"stockSymbol\": \"NDF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73959\",\n" +
            "                \"stockSymbol\": \"NDP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77719\",\n" +
            "                \"stockSymbol\": \"NDT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78421\",\n" +
            "                \"stockSymbol\": \"NDW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76421\",\n" +
            "                \"stockSymbol\": \"NED\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3764\",\n" +
            "                \"stockSymbol\": \"NGC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73201\",\n" +
            "                \"stockSymbol\": \"NHP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76119\",\n" +
            "                \"stockSymbol\": \"NHV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79783\",\n" +
            "                \"stockSymbol\": \"NJC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74859\",\n" +
            "                \"stockSymbol\": \"NLS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:55085\",\n" +
            "                \"stockSymbol\": \"NNT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:63775\",\n" +
            "                \"stockSymbol\": \"NOS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73479\",\n" +
            "                \"stockSymbol\": \"NQB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77379\",\n" +
            "                \"stockSymbol\": \"NQN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75379\",\n" +
            "                \"stockSymbol\": \"NQT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75303\",\n" +
            "                \"stockSymbol\": \"NS2\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74619\",\n" +
            "                \"stockSymbol\": \"NSG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78599\",\n" +
            "                \"stockSymbol\": \"NSL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77841\",\n" +
            "                \"stockSymbol\": \"NSS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72479\",\n" +
            "                \"stockSymbol\": \"NTB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75422\",\n" +
            "                \"stockSymbol\": \"NTC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78522\",\n" +
            "                \"stockSymbol\": \"NTF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76822\",\n" +
            "                \"stockSymbol\": \"NTT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:67356\",\n" +
            "                \"stockSymbol\": \"NTW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75680\",\n" +
            "                \"stockSymbol\": \"NUE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75421\",\n" +
            "                \"stockSymbol\": \"NVP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74439\",\n" +
            "                \"stockSymbol\": \"NWT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80621\",\n" +
            "                \"stockSymbol\": \"NXT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80785\",\n" +
            "                \"stockSymbol\": \"ODE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77019\",\n" +
            "                \"stockSymbol\": \"OIL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75682\",\n" +
            "                \"stockSymbol\": \"ONW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75583\",\n" +
            "                \"stockSymbol\": \"PAI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80341\",\n" +
            "                \"stockSymbol\": \"PAP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79601\",\n" +
            "                \"stockSymbol\": \"PAS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81101\",\n" +
            "                \"stockSymbol\": \"PAT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78901\",\n" +
            "                \"stockSymbol\": \"PBC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78079\",\n" +
            "                \"stockSymbol\": \"PBT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76659\",\n" +
            "                \"stockSymbol\": \"PCC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75819\",\n" +
            "                \"stockSymbol\": \"PCF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76381\",\n" +
            "                \"stockSymbol\": \"PCM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74102\",\n" +
            "                \"stockSymbol\": \"PCN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:7244\",\n" +
            "                \"stockSymbol\": \"PDC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75940\",\n" +
            "                \"stockSymbol\": \"PDV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:62492\",\n" +
            "                \"stockSymbol\": \"PEC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77860\",\n" +
            "                \"stockSymbol\": \"PEG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74220\",\n" +
            "                \"stockSymbol\": \"PEQ\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:14036\",\n" +
            "                \"stockSymbol\": \"PFL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79801\",\n" +
            "                \"stockSymbol\": \"PGB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:8564\",\n" +
            "                \"stockSymbol\": \"PHH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73619\",\n" +
            "                \"stockSymbol\": \"PHP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:10852\",\n" +
            "                \"stockSymbol\": \"PHS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:19756\",\n" +
            "                \"stockSymbol\": \"PID\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74200\",\n" +
            "                \"stockSymbol\": \"PIS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:12672\",\n" +
            "                \"stockSymbol\": \"PIV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:67676\",\n" +
            "                \"stockSymbol\": \"PJS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76648\",\n" +
            "                \"stockSymbol\": \"PLA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79786\",\n" +
            "                \"stockSymbol\": \"PLE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79241\",\n" +
            "                \"stockSymbol\": \"PLO\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74759\",\n" +
            "                \"stockSymbol\": \"PMJ\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:61452\",\n" +
            "                \"stockSymbol\": \"PMT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78559\",\n" +
            "                \"stockSymbol\": \"PMW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75660\",\n" +
            "                \"stockSymbol\": \"PND\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74419\",\n" +
            "                \"stockSymbol\": \"PNG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78299\",\n" +
            "                \"stockSymbol\": \"PNP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75539\",\n" +
            "                \"stockSymbol\": \"PNT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76526\",\n" +
            "                \"stockSymbol\": \"POB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75322\",\n" +
            "                \"stockSymbol\": \"POS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:62812\",\n" +
            "                \"stockSymbol\": \"POV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76404\",\n" +
            "                \"stockSymbol\": \"PPH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78339\",\n" +
            "                \"stockSymbol\": \"PPI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78781\",\n" +
            "                \"stockSymbol\": \"PQN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72782\",\n" +
            "                \"stockSymbol\": \"PRO\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77220\",\n" +
            "                \"stockSymbol\": \"PRT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54725\",\n" +
            "                \"stockSymbol\": \"PSB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:15156\",\n" +
            "                \"stockSymbol\": \"PSG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54785\",\n" +
            "                \"stockSymbol\": \"PSL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76219\",\n" +
            "                \"stockSymbol\": \"PSN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54264\",\n" +
            "                \"stockSymbol\": \"PSP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73540\",\n" +
            "                \"stockSymbol\": \"PTE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54326\",\n" +
            "                \"stockSymbol\": \"PTG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54604\",\n" +
            "                \"stockSymbol\": \"PTH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81381\",\n" +
            "                \"stockSymbol\": \"PTN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76140\",\n" +
            "                \"stockSymbol\": \"PTO\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54324\",\n" +
            "                \"stockSymbol\": \"PTP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:55164\",\n" +
            "                \"stockSymbol\": \"PTT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78861\",\n" +
            "                \"stockSymbol\": \"PTV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77560\",\n" +
            "                \"stockSymbol\": \"PTX\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:5824\",\n" +
            "                \"stockSymbol\": \"PVA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3545\",\n" +
            "                \"stockSymbol\": \"PVE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76059\",\n" +
            "                \"stockSymbol\": \"PVH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:8924\",\n" +
            "                \"stockSymbol\": \"PVL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75404\",\n" +
            "                \"stockSymbol\": \"PVM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74201\",\n" +
            "                \"stockSymbol\": \"PVO\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:10952\",\n" +
            "                \"stockSymbol\": \"PVR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:12932\",\n" +
            "                \"stockSymbol\": \"PVV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:7044\",\n" +
            "                \"stockSymbol\": \"PVX\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76825\",\n" +
            "                \"stockSymbol\": \"PVY\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78420\",\n" +
            "                \"stockSymbol\": \"PWA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76261\",\n" +
            "                \"stockSymbol\": \"PWS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:63535\",\n" +
            "                \"stockSymbol\": \"PX1\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:15356\",\n" +
            "                \"stockSymbol\": \"PXA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75584\",\n" +
            "                \"stockSymbol\": \"PXC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80981\",\n" +
            "                \"stockSymbol\": \"PXI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74620\",\n" +
            "                \"stockSymbol\": \"PXL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72679\",\n" +
            "                \"stockSymbol\": \"PXM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81141\",\n" +
            "                \"stockSymbol\": \"PXS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80241\",\n" +
            "                \"stockSymbol\": \"PXT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:12512\",\n" +
            "                \"stockSymbol\": \"QCC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75411\",\n" +
            "                \"stockSymbol\": \"QHW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3726\",\n" +
            "                \"stockSymbol\": \"QNC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75426\",\n" +
            "                \"stockSymbol\": \"QNS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79042\",\n" +
            "                \"stockSymbol\": \"QNT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75668\",\n" +
            "                \"stockSymbol\": \"QNU\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75461\",\n" +
            "                \"stockSymbol\": \"QNW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72699\",\n" +
            "                \"stockSymbol\": \"QPH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75039\",\n" +
            "                \"stockSymbol\": \"QSP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75746\",\n" +
            "                \"stockSymbol\": \"QTP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74919\",\n" +
            "                \"stockSymbol\": \"RAT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74280\",\n" +
            "                \"stockSymbol\": \"RBC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75361\",\n" +
            "                \"stockSymbol\": \"RCC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73179\",\n" +
            "                \"stockSymbol\": \"RCD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76159\",\n" +
            "                \"stockSymbol\": \"RGC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81021\",\n" +
            "                \"stockSymbol\": \"RIC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75239\",\n" +
            "                \"stockSymbol\": \"RTB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3624\",\n" +
            "                \"stockSymbol\": \"S12\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73039\",\n" +
            "                \"stockSymbol\": \"S27\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77260\",\n" +
            "                \"stockSymbol\": \"S72\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:6644\",\n" +
            "                \"stockSymbol\": \"S74\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3584\",\n" +
            "                \"stockSymbol\": \"S96\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75240\",\n" +
            "                \"stockSymbol\": \"SAC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76622\",\n" +
            "                \"stockSymbol\": \"SAL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:1263\",\n" +
            "                \"stockSymbol\": \"SAP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73301\",\n" +
            "                \"stockSymbol\": \"SAS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75441\",\n" +
            "                \"stockSymbol\": \"SB1\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75681\",\n" +
            "                \"stockSymbol\": \"SBD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77320\",\n" +
            "                \"stockSymbol\": \"SBH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75599\",\n" +
            "                \"stockSymbol\": \"SBL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76519\",\n" +
            "                \"stockSymbol\": \"SBM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79661\",\n" +
            "                \"stockSymbol\": \"SBR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72579\",\n" +
            "                \"stockSymbol\": \"SBS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72739\",\n" +
            "                \"stockSymbol\": \"SCC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:2704\",\n" +
            "                \"stockSymbol\": \"SCJ\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:12632\",\n" +
            "                \"stockSymbol\": \"SCL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:61812\",\n" +
            "                \"stockSymbol\": \"SCO\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76624\",\n" +
            "                \"stockSymbol\": \"SCY\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:11974\",\n" +
            "                \"stockSymbol\": \"SD1\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3204\",\n" +
            "                \"stockSymbol\": \"SD2\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72459\",\n" +
            "                \"stockSymbol\": \"SD3\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:4304\",\n" +
            "                \"stockSymbol\": \"SD4\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:1702\",\n" +
            "                \"stockSymbol\": \"SD7\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74159\",\n" +
            "                \"stockSymbol\": \"SD8\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:8404\",\n" +
            "                \"stockSymbol\": \"SDB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3745\",\n" +
            "                \"stockSymbol\": \"SDD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72839\",\n" +
            "                \"stockSymbol\": \"SDJ\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:59847\",\n" +
            "                \"stockSymbol\": \"SDK\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:6284\",\n" +
            "                \"stockSymbol\": \"SDP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:64736\",\n" +
            "                \"stockSymbol\": \"SDV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73725\",\n" +
            "                \"stockSymbol\": \"SDX\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:1545\",\n" +
            "                \"stockSymbol\": \"SDY\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75440\",\n" +
            "                \"stockSymbol\": \"SEA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75587\",\n" +
            "                \"stockSymbol\": \"SEP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79641\",\n" +
            "                \"stockSymbol\": \"SGB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80481\",\n" +
            "                \"stockSymbol\": \"SGI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74100\",\n" +
            "                \"stockSymbol\": \"SGO\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74519\",\n" +
            "                \"stockSymbol\": \"SGP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:59992\",\n" +
            "                \"stockSymbol\": \"SGS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76600\",\n" +
            "                \"stockSymbol\": \"SHC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73299\",\n" +
            "                \"stockSymbol\": \"SHG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75081\",\n" +
            "                \"stockSymbol\": \"SHX\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75500\",\n" +
            "                \"stockSymbol\": \"SID\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78801\",\n" +
            "                \"stockSymbol\": \"SIG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81621\",\n" +
            "                \"stockSymbol\": \"SII\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76023\",\n" +
            "                \"stockSymbol\": \"SIV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3144\",\n" +
            "                \"stockSymbol\": \"SJC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76959\",\n" +
            "                \"stockSymbol\": \"SJG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3664\",\n" +
            "                \"stockSymbol\": \"SJM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76623\",\n" +
            "                \"stockSymbol\": \"SKH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77780\",\n" +
            "                \"stockSymbol\": \"SKN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76642\",\n" +
            "                \"stockSymbol\": \"SKV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72799\",\n" +
            "                \"stockSymbol\": \"SNC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76647\",\n" +
            "                \"stockSymbol\": \"SNZ\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75020\",\n" +
            "                \"stockSymbol\": \"SP2\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75123\",\n" +
            "                \"stockSymbol\": \"SPB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54844\",\n" +
            "                \"stockSymbol\": \"SPD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72619\",\n" +
            "                \"stockSymbol\": \"SPH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75679\",\n" +
            "                \"stockSymbol\": \"SPV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:8084\",\n" +
            "                \"stockSymbol\": \"SQC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:4004\",\n" +
            "                \"stockSymbol\": \"SRB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75300\",\n" +
            "                \"stockSymbol\": \"SRT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54766\",\n" +
            "                \"stockSymbol\": \"SSF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:14436\",\n" +
            "                \"stockSymbol\": \"SSG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80401\",\n" +
            "                \"stockSymbol\": \"SSH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72359\",\n" +
            "                \"stockSymbol\": \"SSN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79163\",\n" +
            "                \"stockSymbol\": \"STH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72399\",\n" +
            "                \"stockSymbol\": \"STL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54845\",\n" +
            "                \"stockSymbol\": \"STS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77500\",\n" +
            "                \"stockSymbol\": \"STT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77460\",\n" +
            "                \"stockSymbol\": \"STW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74442\",\n" +
            "                \"stockSymbol\": \"SVG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76824\",\n" +
            "                \"stockSymbol\": \"SVH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:64596\",\n" +
            "                \"stockSymbol\": \"SWC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75382\",\n" +
            "                \"stockSymbol\": \"SZE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80701\",\n" +
            "                \"stockSymbol\": \"SZG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76861\",\n" +
            "                \"stockSymbol\": \"TA3\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76719\",\n" +
            "                \"stockSymbol\": \"TA6\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78400\",\n" +
            "                \"stockSymbol\": \"TAN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74880\",\n" +
            "                \"stockSymbol\": \"TAW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75499\",\n" +
            "                \"stockSymbol\": \"TB8\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72879\",\n" +
            "                \"stockSymbol\": \"TBD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80422\",\n" +
            "                \"stockSymbol\": \"TBH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81221\",\n" +
            "                \"stockSymbol\": \"TBR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54726\",\n" +
            "                \"stockSymbol\": \"TBT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77700\",\n" +
            "                \"stockSymbol\": \"TCI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76699\",\n" +
            "                \"stockSymbol\": \"TCJ\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76625\",\n" +
            "                \"stockSymbol\": \"TCK\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76181\",\n" +
            "                \"stockSymbol\": \"TCW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76284\",\n" +
            "                \"stockSymbol\": \"TDB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79281\",\n" +
            "                \"stockSymbol\": \"TDF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:65996\",\n" +
            "                \"stockSymbol\": \"TDS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80941\",\n" +
            "                \"stockSymbol\": \"TED\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76540\",\n" +
            "                \"stockSymbol\": \"TEL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54027\",\n" +
            "                \"stockSymbol\": \"TGP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:7765\",\n" +
            "                \"stockSymbol\": \"TH1\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76601\",\n" +
            "                \"stockSymbol\": \"THN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78881\",\n" +
            "                \"stockSymbol\": \"THP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76099\",\n" +
            "                \"stockSymbol\": \"THU\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74320\",\n" +
            "                \"stockSymbol\": \"THW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77899\",\n" +
            "                \"stockSymbol\": \"TID\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78679\",\n" +
            "                \"stockSymbol\": \"TIE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80721\",\n" +
            "                \"stockSymbol\": \"TIN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:64836\",\n" +
            "                \"stockSymbol\": \"TIS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79381\",\n" +
            "                \"stockSymbol\": \"TKA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73139\",\n" +
            "                \"stockSymbol\": \"TL4\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78102\",\n" +
            "                \"stockSymbol\": \"TLI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76779\",\n" +
            "                \"stockSymbol\": \"TLP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72298\",\n" +
            "                \"stockSymbol\": \"TLT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75623\",\n" +
            "                \"stockSymbol\": \"TMG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54364\",\n" +
            "                \"stockSymbol\": \"TMW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54846\",\n" +
            "                \"stockSymbol\": \"TNB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54186\",\n" +
            "                \"stockSymbol\": \"TNM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75410\",\n" +
            "                \"stockSymbol\": \"TNP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75506\",\n" +
            "                \"stockSymbol\": \"TNS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76025\",\n" +
            "                \"stockSymbol\": \"TNW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73520\",\n" +
            "                \"stockSymbol\": \"TOP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80441\",\n" +
            "                \"stockSymbol\": \"TOS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78101\",\n" +
            "                \"stockSymbol\": \"TOW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74000\",\n" +
            "                \"stockSymbol\": \"TPS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75641\",\n" +
            "                \"stockSymbol\": \"TQN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78439\",\n" +
            "                \"stockSymbol\": \"TQW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79561\",\n" +
            "                \"stockSymbol\": \"TR1\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73721\",\n" +
            "                \"stockSymbol\": \"TRS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75759\",\n" +
            "                \"stockSymbol\": \"TRT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76881\",\n" +
            "                \"stockSymbol\": \"TS3\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80501\",\n" +
            "                \"stockSymbol\": \"TS4\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76865\",\n" +
            "                \"stockSymbol\": \"TSD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75920\",\n" +
            "                \"stockSymbol\": \"TSG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76340\",\n" +
            "                \"stockSymbol\": \"TSJ\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3244\",\n" +
            "                \"stockSymbol\": \"TST\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75642\",\n" +
            "                \"stockSymbol\": \"TTD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54564\",\n" +
            "                \"stockSymbol\": \"TTG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75919\",\n" +
            "                \"stockSymbol\": \"TTN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75744\",\n" +
            "                \"stockSymbol\": \"TTP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76039\",\n" +
            "                \"stockSymbol\": \"TTS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75661\",\n" +
            "                \"stockSymbol\": \"TUG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77400\",\n" +
            "                \"stockSymbol\": \"TV1\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80203\",\n" +
            "                \"stockSymbol\": \"TV6\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75900\",\n" +
            "                \"stockSymbol\": \"TVA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54565\",\n" +
            "                \"stockSymbol\": \"TVG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78060\",\n" +
            "                \"stockSymbol\": \"TVH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74119\",\n" +
            "                \"stockSymbol\": \"TVM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74221\",\n" +
            "                \"stockSymbol\": \"TVN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76399\",\n" +
            "                \"stockSymbol\": \"TVP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76780\",\n" +
            "                \"stockSymbol\": \"TVW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75122\",\n" +
            "                \"stockSymbol\": \"TW3\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75279\",\n" +
            "                \"stockSymbol\": \"UCT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81641\",\n" +
            "                \"stockSymbol\": \"UDC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54424\",\n" +
            "                \"stockSymbol\": \"UDJ\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79061\",\n" +
            "                \"stockSymbol\": \"UDL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73723\",\n" +
            "                \"stockSymbol\": \"UEM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76459\",\n" +
            "                \"stockSymbol\": \"UMC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75921\",\n" +
            "                \"stockSymbol\": \"UPC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75481\",\n" +
            "                \"stockSymbol\": \"UPH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75643\",\n" +
            "                \"stockSymbol\": \"USC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78119\",\n" +
            "                \"stockSymbol\": \"USD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:69636\",\n" +
            "                \"stockSymbol\": \"V11\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:8085\",\n" +
            "                \"stockSymbol\": \"V15\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80381\",\n" +
            "                \"stockSymbol\": \"VAB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76324\",\n" +
            "                \"stockSymbol\": \"VAV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78639\",\n" +
            "                \"stockSymbol\": \"VBB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75781\",\n" +
            "                \"stockSymbol\": \"VBG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:1782\",\n" +
            "                \"stockSymbol\": \"VBH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3724\",\n" +
            "                \"stockSymbol\": \"VC5\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75480\",\n" +
            "                \"stockSymbol\": \"VCE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75402\",\n" +
            "                \"stockSymbol\": \"VCP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:9204\",\n" +
            "                \"stockSymbol\": \"VCR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:61852\",\n" +
            "                \"stockSymbol\": \"VCT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75321\",\n" +
            "                \"stockSymbol\": \"VCW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72559\",\n" +
            "                \"stockSymbol\": \"VCX\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77921\",\n" +
            "                \"stockSymbol\": \"VDB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54645\",\n" +
            "                \"stockSymbol\": \"VDN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:62692\",\n" +
            "                \"stockSymbol\": \"VDT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3744\",\n" +
            "                \"stockSymbol\": \"VE9\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77439\",\n" +
            "                \"stockSymbol\": \"VEA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76303\",\n" +
            "                \"stockSymbol\": \"VEC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74101\",\n" +
            "                \"stockSymbol\": \"VEF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73202\",\n" +
            "                \"stockSymbol\": \"VES\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76781\",\n" +
            "                \"stockSymbol\": \"VET\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72277\",\n" +
            "                \"stockSymbol\": \"VFC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:1741\",\n" +
            "                \"stockSymbol\": \"VFR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74339\",\n" +
            "                \"stockSymbol\": \"VGG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77759\",\n" +
            "                \"stockSymbol\": \"VGI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74920\",\n" +
            "                \"stockSymbol\": \"VGL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77139\",\n" +
            "                \"stockSymbol\": \"VGR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75485\",\n" +
            "                \"stockSymbol\": \"VGT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76306\",\n" +
            "                \"stockSymbol\": \"VGV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76200\",\n" +
            "                \"stockSymbol\": \"VHD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54605\",\n" +
            "                \"stockSymbol\": \"VHF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78359\",\n" +
            "                \"stockSymbol\": \"VHG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:10372\",\n" +
            "                \"stockSymbol\": \"VHH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:15656\",\n" +
            "                \"stockSymbol\": \"VIE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75943\",\n" +
            "                \"stockSymbol\": \"VIH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75586\",\n" +
            "                \"stockSymbol\": \"VIM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72719\",\n" +
            "                \"stockSymbol\": \"VIN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:55144\",\n" +
            "                \"stockSymbol\": \"VIR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76829\",\n" +
            "                \"stockSymbol\": \"VIW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:14196\",\n" +
            "                \"stockSymbol\": \"VKC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72379\",\n" +
            "                \"stockSymbol\": \"VKP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75019\",\n" +
            "                \"stockSymbol\": \"VLB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73821\",\n" +
            "                \"stockSymbol\": \"VLC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74599\",\n" +
            "                \"stockSymbol\": \"VLF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73720\",\n" +
            "                \"stockSymbol\": \"VLG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76305\",\n" +
            "                \"stockSymbol\": \"VLP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76307\",\n" +
            "                \"stockSymbol\": \"VLW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73659\",\n" +
            "                \"stockSymbol\": \"VMA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76599\",\n" +
            "                \"stockSymbol\": \"VMG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81525\",\n" +
            "                \"stockSymbol\": \"VMT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76001\",\n" +
            "                \"stockSymbol\": \"VNA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74819\",\n" +
            "                \"stockSymbol\": \"VNB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75860\",\n" +
            "                \"stockSymbol\": \"VNH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73419\",\n" +
            "                \"stockSymbol\": \"VNI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73639\",\n" +
            "                \"stockSymbol\": \"VNP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54344\",\n" +
            "                \"stockSymbol\": \"VNX\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77619\",\n" +
            "                \"stockSymbol\": \"VNY\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81521\",\n" +
            "                \"stockSymbol\": \"VNZ\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74999\",\n" +
            "                \"stockSymbol\": \"VOC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74259\",\n" +
            "                \"stockSymbol\": \"VPA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:19156\",\n" +
            "                \"stockSymbol\": \"VPC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75403\",\n" +
            "                \"stockSymbol\": \"VPR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76660\",\n" +
            "                \"stockSymbol\": \"VPW\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:54464\",\n" +
            "                \"stockSymbol\": \"VQC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72959\",\n" +
            "                \"stockSymbol\": \"VRG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77783\",\n" +
            "                \"stockSymbol\": \"VSE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77179\",\n" +
            "                \"stockSymbol\": \"VSF\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72318\",\n" +
            "                \"stockSymbol\": \"VSG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75163\",\n" +
            "                \"stockSymbol\": \"VSN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73440\",\n" +
            "                \"stockSymbol\": \"VST\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:67456\",\n" +
            "                \"stockSymbol\": \"VTA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78841\",\n" +
            "                \"stockSymbol\": \"VTD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77300\",\n" +
            "                \"stockSymbol\": \"VTE\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74179\",\n" +
            "                \"stockSymbol\": \"VTG\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:63233\",\n" +
            "                \"stockSymbol\": \"VTI\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77979\",\n" +
            "                \"stockSymbol\": \"VTK\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:7\",\n" +
            "                \"stockSymbol\": \"VTL\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74160\",\n" +
            "                \"stockSymbol\": \"VTM\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77919\",\n" +
            "                \"stockSymbol\": \"VTP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80141\",\n" +
            "                \"stockSymbol\": \"VTQ\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78761\",\n" +
            "                \"stockSymbol\": \"VTR\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:621\",\n" +
            "                \"stockSymbol\": \"VTS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:72599\",\n" +
            "                \"stockSymbol\": \"VTX\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80861\",\n" +
            "                \"stockSymbol\": \"VUA\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76620\",\n" +
            "                \"stockSymbol\": \"VVN\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81361\",\n" +
            "                \"stockSymbol\": \"VVS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79261\",\n" +
            "                \"stockSymbol\": \"VW3\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75509\",\n" +
            "                \"stockSymbol\": \"VWS\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:9024\",\n" +
            "                \"stockSymbol\": \"VXB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:78699\",\n" +
            "                \"stockSymbol\": \"VXP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:79341\",\n" +
            "                \"stockSymbol\": \"VXT\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:61792\",\n" +
            "                \"stockSymbol\": \"WSB\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:55304\",\n" +
            "                \"stockSymbol\": \"WTC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77479\",\n" +
            "                \"stockSymbol\": \"X26\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75621\",\n" +
            "                \"stockSymbol\": \"X77\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:81441\",\n" +
            "                \"stockSymbol\": \"XDC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77799\",\n" +
            "                \"stockSymbol\": \"XDH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:75220\",\n" +
            "                \"stockSymbol\": \"XHC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:77279\",\n" +
            "                \"stockSymbol\": \"XLV\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:3404\",\n" +
            "                \"stockSymbol\": \"XMC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:74139\",\n" +
            "                \"stockSymbol\": \"XMD\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:80421\",\n" +
            "                \"stockSymbol\": \"XMP\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:73019\",\n" +
            "                \"stockSymbol\": \"XPH\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:4264\",\n" +
            "                \"stockSymbol\": \"YBC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"stockNo\": \"upcom:76341\",\n" +
            "                \"stockSymbol\": \"YTC\",\n" +
            "                \"exchange\": \"upcom\"\n" +
            "            }\n" +
            "        ]";

    List<StockInfoTemp> stockInfoTemps =  JsonUtils.map(str, new TypeReference<>() {});
    List<StockInfoTemp> stockInfoTemps2 =  JsonUtils.map(str2, new TypeReference<>() {});
    List<StockInfoTemp> stockInfoTemps3 =  JsonUtils.map(str3, new TypeReference<>() {});
    List<StockInfoTemp> stockInfoTemps4 =  JsonUtils.map(str4, new TypeReference<>() {});

    stockInfoTemps.addAll(stockInfoTemps2);
    stockInfoTemps.addAll(stockInfoTemps3);

    List<StockCategoryEntity> stockEntities = new ArrayList<>();
    for (StockInfoTemp stockInfoTemp : stockInfoTemps) {
      StockCategoryEntity temp =
          StockCategoryEntity.builder()
              .code(stockInfoTemp.getStockSymbol())
              .stockCode(stockInfoTemp.getStockNo())
              .exchange(stockInfoTemp.getExchange())
              .build();
      stockEntities.add(temp);
    }
    stockRepository.saveAll(stockEntities);
      List<StockCategoryEntity> res = stockRepository.findAll();
      for(StockCategoryEntity st:res){
      System.out.println(st.toString());
      }
  }
}
