package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券信息列表查询
 *
 * @author auto create
 * @since 1.0, 2016-04-20 13:56:15
 */
public class AlipayOfflineMarketingVoucherListModel extends AlipayObject {

	private static final long serialVersionUID = 4655173775859742362L;

	/**
	 * 为了后续兼容，现在只支持CAMP_TOOL
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 券可以发放的开始时间
	 */
	@ApiField("gmt_create_from")
	private String gmtCreateFrom;

	/**
	 * 券可以发放的结束时间
	 */
	@ApiField("gmt_create_to")
	private String gmtCreateTo;

	/**
	 * 分页跳过页的信息
	 */
	@ApiField("index")
	private String index;

	/**
	 * 每页多少个
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 查询某种状态的券，现在状态有create和start，默认为start
	 */
	@ApiField("status")
	private String status;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getGmtCreateFrom() {
		return this.gmtCreateFrom;
	}
	public void setGmtCreateFrom(String gmtCreateFrom) {
		this.gmtCreateFrom = gmtCreateFrom;
	}

	public String getGmtCreateTo() {
		return this.gmtCreateTo;
	}
	public void setGmtCreateTo(String gmtCreateTo) {
		this.gmtCreateTo = gmtCreateTo;
	}

	public String getIndex() {
		return this.index;
	}
	public void setIndex(String index) {
		this.index = index;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
