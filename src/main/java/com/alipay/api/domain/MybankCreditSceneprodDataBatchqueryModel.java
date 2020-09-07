package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景金融资产信息查询接口
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:39:06
 */
public class MybankCreditSceneprodDataBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7198765878417979753L;

	/**
	 * 订单信息查询参数+ 复杂类型中包括申请单号和客户支付宝uid，通过传递这个列表数据进行批量查询订单信息+ 其中的app_seqno是网商银行的申请单号，通过mybank.credit.sceneprod.loan.apply接口返回的apply_no获取，其中site_user_id是客户的支付宝id，机构通过服务窗获取。
	 */
	@ApiListField("app_seqno_list")
	@ApiField("scene_prod_data_query_param")
	private List<SceneProdDataQueryParam> appSeqnoList;

	public List<SceneProdDataQueryParam> getAppSeqnoList() {
		return this.appSeqnoList;
	}
	public void setAppSeqnoList(List<SceneProdDataQueryParam> appSeqnoList) {
		this.appSeqnoList = appSeqnoList;
	}

}
