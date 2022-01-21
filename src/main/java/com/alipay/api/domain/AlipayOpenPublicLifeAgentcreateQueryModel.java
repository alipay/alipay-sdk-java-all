package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv代创建生活号申请状态查询接口
 *
 * @author auto create
 * @since 1.0, 2021-05-27 16:13:25
 */
public class AlipayOpenPublicLifeAgentcreateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5151814997259294812L;

	/**
	 * 由开发者创建的外部入驻申请单据号，需与<a href="https://opendocs.alipay.com/apis/api_6/alipay.open.public.life.agent.create">alipay.open.public.life.agent.create</a>(isv代创建生活号接口)的out_biz_no一致。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
