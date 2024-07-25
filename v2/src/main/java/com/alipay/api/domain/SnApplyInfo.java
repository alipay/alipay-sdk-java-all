package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sn申请信息
 *
 * @author auto create
 * @since 1.0, 2020-01-08 15:04:53
 */
public class SnApplyInfo extends AlipayObject {

	private static final long serialVersionUID = 2278542396174816218L;

	/**
	 * 唯一id
	 */
	@ApiField("apply_id")
	private Long applyId;

	/**
	 * 申请单描述
	 */
	@ApiField("content")
	private String content;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 物料id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 生成sn的数据
	 */
	@ApiField("sn_count")
	private Long snCount;

	/**
	 * 申请单状态 
-1表示无效
1 表示生成失败
2.申请单生成成功
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 厂商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public Long getApplyId() {
		return this.applyId;
	}
	public void setApplyId(Long applyId) {
		this.applyId = applyId;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Long getSnCount() {
		return this.snCount;
	}
	public void setSnCount(Long snCount) {
		this.snCount = snCount;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
