package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投保推荐检查
 *
 * @author auto create
 * @since 1.0, 2024-01-15 14:31:19
 */
public class AlipayInsSceneInsureRecommendCheckModel extends AlipayObject {

	private static final long serialVersionUID = 8278864745635484921L;

	/**
	 * 被保人列表
	 */
	@ApiListField("insureds")
	@ApiField("ins_open_user_d_t_o")
	private List<InsOpenUserDTO> insureds;

	/**
	 * 外部业务单号，用于幂等，如果不传，系统自动生成
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 合作商表示，蚂蚁保分配
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 推荐用户
	 */
	@ApiField("recommend_user")
	private InsOpenUserDTO recommendUser;

	/**
	 * 蚂蚁保分配
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 标记访问的端，客户端渠道 ios / android / pc / wx_applet(wx小程序)
	 */
	@ApiField("user_client")
	private String userClient;

	public List<InsOpenUserDTO> getInsureds() {
		return this.insureds;
	}
	public void setInsureds(List<InsOpenUserDTO> insureds) {
		this.insureds = insureds;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public InsOpenUserDTO getRecommendUser() {
		return this.recommendUser;
	}
	public void setRecommendUser(InsOpenUserDTO recommendUser) {
		this.recommendUser = recommendUser;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserClient() {
		return this.userClient;
	}
	public void setUserClient(String userClient) {
		this.userClient = userClient;
	}

}
