package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户绑定关系同步接口
 *
 * @author auto create
 * @since 1.0, 2023-02-01 14:08:51
 */
public class AlipayUserAccountBindingSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7282262452523624614L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 版本号，大于等于0
	 */
	@ApiField("data_version")
	private Long dataVersion;

	/**
	 * 淘系用户ID
	 */
	@ApiField("havana_user_id")
	private Long havanaUserId;

	/**
	 * 修改时间
	 */
	@ApiField("modify_time")
	private Date modifyTime;

	/**
	 * 支付宝用户开放ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 淘宝绑定关系领域枚举：
    TAOBAO("0", "淘宝"),
    CBU("1", "1688(CBU)"),
    ALIYUN_LOGIN("2", "阿里云(免登)"),
    ALIYUN_CERTIFY("3", "阿里云(认证)")
	 */
	@ApiField("realm")
	private String realm;

	/**
	 * 淘宝绑定关系状态枚举：
  UNBINDING("0", "未绑定"),
  BINDING("1", "已绑定")
	 */
	@ApiField("status")
	private String status;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(Long dataVersion) {
		this.dataVersion = dataVersion;
	}

	public Long getHavanaUserId() {
		return this.havanaUserId;
	}
	public void setHavanaUserId(Long havanaUserId) {
		this.havanaUserId = havanaUserId;
	}

	public Date getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRealm() {
		return this.realm;
	}
	public void setRealm(String realm) {
		this.realm = realm;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
