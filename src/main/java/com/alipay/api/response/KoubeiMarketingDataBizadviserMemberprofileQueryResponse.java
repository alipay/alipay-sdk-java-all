package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.bizadviser.memberprofile.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingDataBizadviserMemberprofileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4837621217362849552L;

	/** 
	 * result是一个所有结果集合的json串，里面有一下一些信息：
LISTDETAIL：详细数据List。List里面又有下面这五个字段：
indicator_order  指标KEY排序
indicator_value 数值（均价分段是笔数值，其余为会员数）
indicator_value_percent 数值百分比
dimension 和dimension_desc 对应关系如下：
1-性别；2-年龄；3-是否学生；4-是否有小孩；5-消费频率；6-消费金额；7-笔单价；
indicator_key 说明如下：
男、女；用于判断男女
[0,17]、[18,25]、[26,35]、[36,45]、[46,55]、[56,~ ]；
学生、非学生；
有小孩、无小孩；用于判断是否有小孩
1、2、3、4、5、6、次及以上；用于判断消费次数的层级
金额分段区间；均价分段区间
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
