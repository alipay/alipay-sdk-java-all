package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑客推广数据汇总查询
 *
 * @author auto create
 * @since 1.0, 2017-09-29 15:06:09
 */
public class KoubeiAdvertDataPromotesummaryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2662348987353554889L;

	/**
	 * 广告id
如果有这个参数默认搜索这个广告的汇总信息并忽略voucher_name参数
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	public String getAdvId() {
		return this.advId;
	}
	public void setAdvId(String advId) {
		this.advId = advId;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
