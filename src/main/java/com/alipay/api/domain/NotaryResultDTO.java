package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 存证信息
 *
 * @author auto create
 * @since 1.0, 2022-07-01 17:27:44
 */
public class NotaryResultDTO extends AlipayObject {

	private static final long serialVersionUID = 4757351772239779591L;

	/**
	 * 文本存证内容，仅文本存证上链有该值
	 */
	@ApiField("content")
	private String content;

	/**
	 * 存证申请时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 上链状态：上链中|上链成功|上链失败
	 */
	@ApiField("status")
	private String status;

	/**
	 * 状态为上链中时，该时间为上链时间，上链成功时，该时间会更新成上链成功时间
	 */
	@ApiField("sync_chain_time")
	private Date syncChainTime;

	/**
	 * 存证凭据
	 */
	@ApiField("tx_hash")
	private String txHash;

	/**
	 * 存证类型：文本|文件
	 */
	@ApiField("type")
	private String type;

	/**
	 * 文件预览路径，仅文件存证上链返回该值，该临时链接有效期5分钟，过期后点击查询会重新生成新的链接
	 */
	@ApiField("url")
	private String url;

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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getSyncChainTime() {
		return this.syncChainTime;
	}
	public void setSyncChainTime(Date syncChainTime) {
		this.syncChainTime = syncChainTime;
	}

	public String getTxHash() {
		return this.txHash;
	}
	public void setTxHash(String txHash) {
		this.txHash = txHash;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
