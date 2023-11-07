package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pass卡券实例查询接口
 *
 * @author auto create
 * @since 1.0, 2022-02-15 10:41:06
 */
public class AlipayMarketingPassInstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5691842622388285137L;

	/**
	 * 页码，必须为大于0的整数， 1表示第一页，2表示第2页；
不填则默认为1，查第1页数据。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录条数，必须为大于0的整数，最大值为20；
不填则默认20。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 卡券实例id，对应调卡券发放alipay.pass.instance.add接口返回的passId
	 */
	@ApiField("pass_id")
	private String passId;

	/**
	 * 卡券单据号，由商户发券时指定的卡券唯一凭证号。
	 */
	@ApiField("serial_number")
	private String serialNumber;

	/**
	 * 模板ID（编号）
	 */
	@ApiField("tpl_id")
	private String tplId;

	/**
	 * 所属用户user_id
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getPassId() {
		return this.passId;
	}
	public void setPassId(String passId) {
		this.passId = passId;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getTplId() {
		return this.tplId;
	}
	public void setTplId(String tplId) {
		this.tplId = tplId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
