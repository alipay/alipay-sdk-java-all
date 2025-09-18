package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 初始化用户收款账号
 *
 * @author auto create
 * @since 1.0, 2024-12-18 17:19:54
 */
public class AlipayEbppIndustryJobPayslipInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 2519514535761643975L;

	/**
	 * 支付宝登录账号：手机号或者邮箱
	 */
	@ApiField("alipay_login_id")
	private String alipayLoginId;

	/**
	 * 授权成功后回调地址；授权成功后，回调地址会拼接上用户参数及token信息一起返回，用户参数可为alipay_login_id、user_id、open_id、out_biz_no任一种；链接中拼接参数：alipayLoginId、userId、openId、userName、bizNo(必有)、outBizNo；其中oepnId和userId任意一个不为空，都会返回openId和userId；以out_biz_no入参为例，回调成功示例如下：alipays://platformapi/startapp?appId=2021003160674131&query=userName%3Dxxxx%26outBizNo%3D20241211000004%26bizNo%3D212529c081e522543da9450c84dd747b
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 企业名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务id
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAlipayLoginId() {
		return this.alipayLoginId;
	}
	public void setAlipayLoginId(String alipayLoginId) {
		this.alipayLoginId = alipayLoginId;
	}

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
