/*
 * Copyright 2014 Malte Schütze
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.boreeas.riotapi.com.riotgames.platform.account.management;

import lombok.Data;
import net.boreeas.riotapi.rtmp.serialization.Serialization;

/**
 * Created on 8/2/2014.
 */
@Data
@Serialization(name = "com.riotgames.platform.account.management.AccountInformation")
public class AccountInformation {
    private String lastName;
    private String city;
    private String address1;
    private String address2;
    private String state;
    private String zip;
    private String country;
}
