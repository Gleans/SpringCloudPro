/*
 *  Copyright (c) 2019-2020, 冷冷 (wangiegie@gmail.com).
 *  <p>
 *  Licensed under the GNU Lesser General Public License 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  <p>
 * https://www.gnu.org/licenses/lgpl.html
 *  <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package store.zabbix.admin;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import store.zabbix.common.security.annotation.EnableToolsFeignClients;
import store.zabbix.common.security.annotation.EnableToolsResourceServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author lengleng
 * @date 2018年06月21日
 * 用户统一管理系统
 */
//@EnableFeignClients
//@EnableEurekaClient
//@EnableCircuitBreaker
//@SpringBootApplication(scanBasePackages = {"store.zabbix.admin.service","store.zabbix.admin.controller","store.zabbix.admin.config","store.zabbix.auth.api"})
@EnableFeignClients
@MapperScan("store.zabbix.admin.mapper")
@SpringBootApplication(scanBasePackages = {"store.zabbix"})
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ToolsAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(ToolsAdminApplication.class, args);
	}

}