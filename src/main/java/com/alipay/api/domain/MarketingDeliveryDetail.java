package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销投放详情
 *
 * @author auto create
 * @since 1.0, 2022-09-26 14:53:09
 */
public class MarketingDeliveryDetail extends AlipayObject {

	private static final long serialVersionUID = 8113652847165373355L;

	/**
	 * 投放详情绑定的模板id列表
	 */
	@ApiListField("bind_id_list")
	@ApiField("string")
	private List<String> bindIdList;

	/**
	 * 投放详情id
	 */
	@ApiField("detail_id")
	private String detailId;

	/**
	 * 结束时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 开始时间
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 投放详情名称，取创建运营投放的title，未传title取券名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 投放详情状态，INIT:下线状态，ON_LINE:上线状态
	 */
	@ApiField("status")
	private String status;

	public List<String> getBindIdList() {
		return this.bindIdList;
	}
	public void setBindIdList(List<String> bindIdList) {
		this.bindIdList = bindIdList;
	}

	public String getDetailId() {
		return this.detailId;
	}
	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
