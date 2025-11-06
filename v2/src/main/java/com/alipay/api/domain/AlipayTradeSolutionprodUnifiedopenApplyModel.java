package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * C2C个人收款方聚合开通订单创建接口
 *
 * @author auto create
 * @since 1.0, 2025-11-05 17:00:06
 */
public class AlipayTradeSolutionprodUnifiedopenApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3527397125585731989L;

	/**
	 * 结果页点击完成后的跳转地址
1、跳转类型为ALIPAY_URL，back_url就做支付宝端内跳转
2、跳转类型为MERCHANT_URL，back_url就跳转到端外
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 用于开通完成之后的回跳地址类型：
1、类型为MERCHANT_URL，代表需要回跳至端外商户地址，back_url按照跳端方式拼接
2、类型为ALIPAY_URL，代表需要回跳至支付宝端内地址，back_url按照跳支付宝端内方式拼接，支持小程序或h5
	 */
	@ApiField("back_url_type")
	private String backUrlType;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型。
目前只支持传入100（大陆身份证）
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 开通项详情
	 */
	@ApiListField("open_item_list")
	@ApiField("uni_open_req_item")
	private List<UniOpenReqItem> openItemList;

	/**
	 * 外部单据号，由商家自定义。64个字符以内，仅可包含字母、数字、下划线。需保证在商户端不重复。该参数用于幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 个人收款方真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 解决方案code
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getBackUrlType() {
		return this.backUrlType;
	}
	public void setBackUrlType(String backUrlType) {
		this.backUrlType = backUrlType;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public List<UniOpenReqItem> getOpenItemList() {
		return this.openItemList;
	}
	public void setOpenItemList(List<UniOpenReqItem> openItemList) {
		this.openItemList = openItemList;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

}
