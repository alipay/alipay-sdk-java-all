package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询安诊儿驾驶舱看不服务基本统计信息
 *
 * @author auto create
 * @since 1.0, 2025-03-14 19:20:01
 */
public class AlipayCommerceMedicalBidataBlockinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8436745344951498573L;

	/**
	 * 驾驶舱上不同区域的类型:可选类型如下：
"basic_info","trends","hot_words","channel_users","provide_service"
	 */
	@ApiField("block_type")
	private String blockType;

	/**
	 * 默认传 azeApp
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 2025-03-04表示2025年3月4日
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 2025-03-04 表示2025年3月4号
	 */
	@ApiField("start_date")
	private String startDate;

	public String getBlockType() {
		return this.blockType;
	}
	public void setBlockType(String blockType) {
		this.blockType = blockType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
