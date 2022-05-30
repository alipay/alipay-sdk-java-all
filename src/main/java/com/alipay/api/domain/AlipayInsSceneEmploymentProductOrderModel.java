package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订购产品方案
 *
 * @author auto create
 * @since 1.0, 2022-05-06 09:39:44
 */
public class AlipayInsSceneEmploymentProductOrderModel extends AlipayObject {

	private static final long serialVersionUID = 8893882489237922518L;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 企业信息
	 */
	@ApiField("merchant")
	private InsCompany merchant;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 订购产品对应的推荐流水号列表
	 */
	@ApiListField("recom_flow_no_list")
	@ApiField("string")
	private List<String> recomFlowNoList;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public InsCompany getMerchant() {
		return this.merchant;
	}
	public void setMerchant(InsCompany merchant) {
		this.merchant = merchant;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<String> getRecomFlowNoList() {
		return this.recomFlowNoList;
	}
	public void setRecomFlowNoList(List<String> recomFlowNoList) {
		this.recomFlowNoList = recomFlowNoList;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
