package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票业务result
 *
 * @author auto create
 * @since 1.0, 2019-09-04 14:49:50
 */
public class BillInferenceResult extends AlipayObject {

	private static final long serialVersionUID = 7269622924265493515L;

	/**
	 * 角度
	 */
	@ApiField("angle")
	private Long angle;

	/**
	 * 分数
	 */
	@ApiField("bill_score")
	private Long billScore;

	/**
	 * 算法版本
	 */
	@ApiField("bill_version")
	private String billVersion;

	/**
	 * 发票金额
	 */
	@ApiListField("capital_sum")
	@ApiField("string")
	private List<String> capitalSum;

	/**
	 * 发票时间
	 */
	@ApiListField("date")
	@ApiField("string")
	private List<String> date;

	/**
	 * 发票报销人
	 */
	@ApiListField("name")
	@ApiField("string")
	private List<String> name;

	/**
	 * 发票号
	 */
	@ApiListField("no")
	@ApiField("string")
	private List<String> no;

	/**
	 * 分辨率
	 */
	@ApiListField("rotate_shape")
	@ApiField("string")
	private List<String> rotateShape;

	/**
	 * 发票标题
	 */
	@ApiListField("title")
	@ApiField("string")
	private List<String> title;

	public Long getAngle() {
		return this.angle;
	}
	public void setAngle(Long angle) {
		this.angle = angle;
	}

	public Long getBillScore() {
		return this.billScore;
	}
	public void setBillScore(Long billScore) {
		this.billScore = billScore;
	}

	public String getBillVersion() {
		return this.billVersion;
	}
	public void setBillVersion(String billVersion) {
		this.billVersion = billVersion;
	}

	public List<String> getCapitalSum() {
		return this.capitalSum;
	}
	public void setCapitalSum(List<String> capitalSum) {
		this.capitalSum = capitalSum;
	}

	public List<String> getDate() {
		return this.date;
	}
	public void setDate(List<String> date) {
		this.date = date;
	}

	public List<String> getName() {
		return this.name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}

	public List<String> getNo() {
		return this.no;
	}
	public void setNo(List<String> no) {
		this.no = no;
	}

	public List<String> getRotateShape() {
		return this.rotateShape;
	}
	public void setRotateShape(List<String> rotateShape) {
		this.rotateShape = rotateShape;
	}

	public List<String> getTitle() {
		return this.title;
	}
	public void setTitle(List<String> title) {
		this.title = title;
	}

}
