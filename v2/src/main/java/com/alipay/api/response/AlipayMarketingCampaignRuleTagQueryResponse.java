package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.rule.tag.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 10:27:37
 */
public class AlipayMarketingCampaignRuleTagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8588676281467388336L;

	/** 
	 * {
    "categories": [
        {
            "tags": [
                {
                    "control": "text",
                    "op": "IN",
                    "sources": [
                        "23905"
                    ],
                    "status": "EXECUTING",
                    "tagCode": "pubsrv_custom_batch",
                    "title": "标签描述AAAAB"
                }
            ],
            "title": "自定义标签"
        }
    ]
}

tagCode：自定义标签固定为‘pubsrv_custom_batch’  
sources：取值为创建自定义标签时获取的‘selftag’自定义标签id
status： 自定义标签创建任务状态：COMPLETE:执行完成, FAIL:执行失败, EXECUTING:处理中，只有处于‘COMPLETE’状态的标签才能用于创建圈人规则
	 */
	@ApiField("customtagjson")
	private String customtagjson;

	/** 
	 * {"categories": [{"tags": [{"tagCode": "pubsrv_have_auto","control": "radio-normal","title": "是否有车","op": "EQ","sources": [{"value": "0","label": "否"},{"value": "1","label": "是"}]}]}

标签含义参见 alipay.marketing.campaign.rule.crowd.create （圈人规则创建）
	 */
	@ApiField("scenetagjson")
	private String scenetagjson;

	public void setCustomtagjson(String customtagjson) {
		this.customtagjson = customtagjson;
	}
	public String getCustomtagjson( ) {
		return this.customtagjson;
	}

	public void setScenetagjson(String scenetagjson) {
		this.scenetagjson = scenetagjson;
	}
	public String getScenetagjson( ) {
		return this.scenetagjson;
	}

}
