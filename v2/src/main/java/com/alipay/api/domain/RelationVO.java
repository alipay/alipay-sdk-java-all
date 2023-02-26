package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 亲子关系模型，包含关系双方信息
 *
 * @author auto create
 * @since 1.0, 2020-08-10 20:25:36
 */
public class RelationVO extends AlipayObject {

	private static final long serialVersionUID = 7273867898187612749L;

	/**
	 * 支付宝账户名称（脱敏）
	 */
	@ApiField("oppo_account_name")
	private String oppoAccountName;

	/**
	 * 唯一标记一个儿童的业务id
	 */
	@ApiField("oppo_child_id")
	private String oppoChildId;

	/**
	 * 头像路径
	 */
	@ApiField("oppo_head_url")
	private String oppoHeadUrl;

	/**
	 * 儿童昵称
	 */
	@ApiField("oppo_nick_name")
	private String oppoNickName;

	/**
	 * 对方真实姓名（脱敏）
	 */
	@ApiField("oppo_real_name")
	private String oppoRealName;

	public String getOppoAccountName() {
		return this.oppoAccountName;
	}
	public void setOppoAccountName(String oppoAccountName) {
		this.oppoAccountName = oppoAccountName;
	}

	public String getOppoChildId() {
		return this.oppoChildId;
	}
	public void setOppoChildId(String oppoChildId) {
		this.oppoChildId = oppoChildId;
	}

	public String getOppoHeadUrl() {
		return this.oppoHeadUrl;
	}
	public void setOppoHeadUrl(String oppoHeadUrl) {
		this.oppoHeadUrl = oppoHeadUrl;
	}

	public String getOppoNickName() {
		return this.oppoNickName;
	}
	public void setOppoNickName(String oppoNickName) {
		this.oppoNickName = oppoNickName;
	}

	public String getOppoRealName() {
		return this.oppoRealName;
	}
	public void setOppoRealName(String oppoRealName) {
		this.oppoRealName = oppoRealName;
	}

}
