package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁商家扣款签约查询
 *
 * @author auto create
 * @since 1.0, 2025-09-22 14:16:33
 */
public class AlipayCircularAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3711935656284864133L;

	/**
	 * 绑定的收款钱包信息Id
	 */
	@ApiField("bind_wallet_id")
	private String bindWalletId;

	/**
	 * 代扣关系支付类型
	 */
	@ApiField("bind_wallet_type")
	private String bindWalletType;

	/**
	 * 分页查询页码，默认1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询单页数据条数，默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 扣款账户所属openid
	 */
	@ApiField("relation_openid")
	private String relationOpenid;

	/**
	 * 扣款账户所属uid
	 */
	@ApiField("relation_uid")
	private String relationUid;

	/**
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getBindWalletId() {
		return this.bindWalletId;
	}
	public void setBindWalletId(String bindWalletId) {
		this.bindWalletId = bindWalletId;
	}

	public String getBindWalletType() {
		return this.bindWalletType;
	}
	public void setBindWalletType(String bindWalletType) {
		this.bindWalletType = bindWalletType;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRelationOpenid() {
		return this.relationOpenid;
	}
	public void setRelationOpenid(String relationOpenid) {
		this.relationOpenid = relationOpenid;
	}

	public String getRelationUid() {
		return this.relationUid;
	}
	public void setRelationUid(String relationUid) {
		this.relationUid = relationUid;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
