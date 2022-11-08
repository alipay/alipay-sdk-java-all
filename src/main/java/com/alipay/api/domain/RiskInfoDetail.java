package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险明细
 *
 * @author auto create
 * @since 1.0, 2022-08-22 14:17:58
 */
public class RiskInfoDetail extends AlipayObject {

	private static final long serialVersionUID = 6274357644251786738L;

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
	 * 数组中8个数字分别代表左上、右上、右下、左下的坐标信息
	 */
	@ApiField("new_picture_frame")
	private String newPictureFrame;

	/**
	 * 图片画框 左上/右下坐标 以左下角为基准点
	 */
	@ApiField("picture_frame")
	private String pictureFrame;

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
