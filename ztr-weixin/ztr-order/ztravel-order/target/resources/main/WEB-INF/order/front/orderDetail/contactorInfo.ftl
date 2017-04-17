<#macro contactorInfo>

            <#assign contact = (orderDetail.orderContactor)!/>
            <div class="commonOrderModel">
                <i class="left-semicircle"></i>
                <i class="right-semicircle"></i>
                <div class="titleModel blueFonts">
                    <span>联系人信息</span>
                    <label class="editContactInfo" <#if orderDetail.canChange==true>id="edit-contact"</#if>>
                        <span>(出行日15天之内不可更改)</span>
                        <span class="commonIcon editIcon"></span>
                    </label>
                    <i class="left-semicircle"></i>
                    <i class="right-semicircle"></i>
                </div>
                <div class="commonStyle">
                    <table class="commonLightBlueThead contactInfoTab">
                        <colgroup>
                            <col width="135">
                            <col width="150">
                            <col width="220">
                            <col width="490">
                        </colgroup>
                        <thead>
                        <tr>
                            <th>姓名</th>
                            <th>手机号</th>
                            <th>邮箱</th>
                            <th>详细地址</th>
                        </tr>
                        </thead>
                        <tbody>
                        </tbody>
                    </table>
                    <div class="editContactInfoContent">
                        <input type="hidden" name="contactorId" value="">
                        <table class="commonEditTab editContactInfoTab">
                            <colgroup>
                                <col width="150">
                                <col width="">
                            </colgroup>
                            <tbody>
                            <tr>
                                <th>姓名:</th>
                                <td>
                                    <input type="text" style="width: 225px;" name="contactor" value="" onclick="focus();select()">
                                    <div class="verifyStyle contactor-error" style="display: none;"><i class="commonIcon errorIcon"></i>请填写正确姓名</div>
                                </td>
                            </tr>
                            <tr>
                                <th>手机号:</th>
                                <td>
                                    <input type="text" style="width: 225px;" name="phone" value="" onclick="focus();select()">
                                    <div class="verifyStyle phone-error" style="display: none;"><i class="commonIcon errorIcon"></i>请填写正确手机号</div>
                                </td>
                            </tr>
                            <tr>
                                <th>邮箱:</th>
                                <td>
                                    <input type="text" style="width: 225px;" name="email" placeholder="接收行程单和航班信息" value="" maxlength="50" onclick="focus();select()">
                                    <div class="verifyStyle email-error" style="display: none;"><i class="commonIcon errorIcon"></i>邮箱格式有误</div>
                                </td>
                            </tr>
                            <tr>
                                <th>详细地址:</th>
                                <td>
                                    <div class="dropdown" style="width: 95px;">
                                        <a href="javascript:void(0);" data-toggle="dropdown" class="dropdownBtn" aria-expanded="false">
                                           <span class="activeFonts" id="province"></span>
                                           <span class="caret"></span>
                                       </a>
                                       <ul class="dropdown-menu" id="province-menu"></ul>
                                    </div>
                                    <div class="dropdown" style="width: 95px;">
                                    <a href="javascript:void(0);" data-toggle="dropdown" class="dropdownBtn">
                                        <span id="city" class="activeFonts"></span>
                                        <span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu" id="city-menu"></ul>
                                    </div>
                                    <div class="dropdown" style="width: 95px;">
                                    <a href="javascript:void(0);" data-toggle="dropdown" class="dropdownBtn">
                                        <span id="county" class="activeFonts"></span>
                                        <span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu" id="county-menu"></ul>
                                    </div>
                                    <input type="text" style="width: 350px;" name="address" placeholder="填写详细通讯地址，好签收我们为您寄出的真旅礼盒哦"
                                    value="" onclick="focus();select()">
                                    <div class="verifyStyle dropdown-error" style="display: none;"><i class="commonIcon errorIcon"></i>地址必填</div>
                                    <div class="verifyStyle address-error" style="display: none;"><i class="commonIcon errorIcon"></i>请填写100个以内中英文字符</div>
                                </td>
                            </tr>
                            <tr>
                                <th></th>
                                <td>
                                    <a href="javascript:void(0);" class="commonBtn blueBtn">保 存</a>
                                    <a href="javascript:void(0);" class="cancelBtn">取消</a>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>

</#macro>