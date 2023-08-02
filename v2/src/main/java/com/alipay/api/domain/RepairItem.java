package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修理厂员工确认的维修项
 *
 * @author auto create
 * @since 1.0, 2019-10-23 21:29:32
 */
public class RepairItem extends AlipayObject {

	private static final long serialVersionUID = 1712575872559431758L;

	/**
	 * 配件编码
	 */
	@ApiField("part_id")
	private String partId;

	/**
	 * 支付类型：
SELF_PAY("SELF", "自付"),
FREE_PAY("FREE", "免费");
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 维修项价格，单位：分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * L1("L1", "轻度钣金"),
L2("L2", "中度钣金"),
L3("L3", "重度钣金"),
P1("P1", "半喷"),
P2("P2", "全喷"),
P3("P3", "补漆"),
NONE("none", "无"),
	 */
	@ApiField("repair_degree")
	private String repairDegree;

	/**
	 * R1("R1","喷漆"),
R2("R2","钣金"),
R3("R3","拆装"),
R4("R4","更换"),
R5("R5","电工"),
R6("R6","机修"),
R7("R7","抛光"),
R8("R8","外修"),
	 */
	@ApiField("repair_type")
	private String repairType;

	public String getPartId() {
		return this.partId;
	}
	public void setPartId(String partId) {
		this.partId = partId;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getRepairDegree() {
		return this.repairDegree;
	}
	public void setRepairDegree(String repairDegree) {
		this.repairDegree = repairDegree;
	}

	public String getRepairType() {
		return this.repairType;
	}
	public void setRepairType(String repairType) {
		this.repairType = repairType;
	}

}
