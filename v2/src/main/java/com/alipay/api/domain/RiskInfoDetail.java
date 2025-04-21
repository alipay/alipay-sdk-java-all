package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险明细
 *
 * @author auto create
 * @since 1.0, 2023-04-06 10:17:48
 */
public class RiskInfoDetail extends AlipayObject {

	private static final long serialVersionUID = 7631842947125264674L;

	/**
	 * 一致性ID
	 */
	@ApiField("consistency_id")
	private String consistencyId;

	/**
	 * 对话下标
	 */
	@ApiField("dialog_index")
	private String dialogIndex;

	/**
	 * 命中词
	 */
	@ApiField("hit_word")
	private String hitWord;

	/**
	 * 命中文字坐标,文字中第几个字到第几个字
	 */
	@ApiField("hit_word_index")
	private String hitWordIndex;

	/**
	 * 命中词类别（全文/对话 FULL_TEXT/DIALOGUE）
	 */
	@ApiField("hit_word_type")
	private String hitWordType;

	/**
	 * 数组中8个数字分别代表左上、右上、右下、左下的坐标信息
	 */
	@ApiField("new_picture_frame")
	private String newPictureFrame;

	/**
	 * 图片画框 左上/右下坐标 以左下角为基准点
	 */
	@ApiField("picture_frame")
	private String pictureFrame;

	public String getConsistencyId() {
		return this.consistencyId;
	}
	public void setConsistencyId(String consistencyId) {
		this.consistencyId = consistencyId;
	}

	public String getDialogIndex() {
		return this.dialogIndex;
	}
	public void setDialogIndex(String dialogIndex) {
		this.dialogIndex = dialogIndex;
	}

	public String getHitWord() {
		return this.hitWord;
	}
	public void setHitWord(String hitWord) {
		this.hitWord = hitWord;
	}

	public String getHitWordIndex() {
		return this.hitWordIndex;
	}
	public void setHitWordIndex(String hitWordIndex) {
		this.hitWordIndex = hitWordIndex;
	}

	public String getHitWordType() {
		return this.hitWordType;
	}
	public void setHitWordType(String hitWordType) {
		this.hitWordType = hitWordType;
	}

	public String getNewPictureFrame() {
		return this.newPictureFrame;
	}
	public void setNewPictureFrame(String newPictureFrame) {
		this.newPictureFrame = newPictureFrame;
	}

	public String getPictureFrame() {
		return this.pictureFrame;
	}
	public void setPictureFrame(String pictureFrame) {
		this.pictureFrame = pictureFrame;
	}

}
