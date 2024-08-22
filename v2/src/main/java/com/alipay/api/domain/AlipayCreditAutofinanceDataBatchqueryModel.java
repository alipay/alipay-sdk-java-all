package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 汽车金融数据批量查询接口
 *
 * @author auto create
 * @since 1.0, 2017-10-17 17:33:41
 */
public class AlipayCreditAutofinanceDataBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3246483446817661968L;

	/**
	 * 订单信息查询参数+ 复杂类型中包括申请单号和客户支付宝uid，通过传递这个列表数据进行批量查询订单信息+ 其中的app_seqno是网商银行的申请单号，通过alipay.credit.autofinance.loan.apply 接口返回的applyno获取，其中uid是客户的支付宝id，机构通过服务窗获取。
	 */
	@ApiListField("app_seqno_list")
	@ApiField("scene_data_query_param")
	private List<SceneDataQueryParam> appSeqnoList;

	public List<SceneDataQueryParam> getAppSeqnoList() {
		return this.appSeqnoList;
	}
	public void setAppSeqnoList(List<SceneDataQueryParam> appSeqnoList) {
		this.appSeqnoList = appSeqnoList;
	}

}
