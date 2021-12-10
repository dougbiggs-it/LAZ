<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Contact Details                User Det_c93701</name>
   <tag></tag>
   <elementGuidId>ba867c4f-918d-448c-ae33-1269569ad59d</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='container']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#container</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>container</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>

        
            
            
        
            
                Contact Details 
                User Details 
                Payment Info
            
        
		



	
		.embeddedServiceHelpButton .helpButton .uiButton {
			background-color: #e21d46;
			font-family: &quot;Salesforce Sans&quot;, sans-serif;
		}
		.embeddedServiceHelpButton .helpButton .uiButton:focus {
			outline: 1px solid #e21d46;
		}
		@font-face {
			font-family: 'Salesforce Sans';
			src: url('/shared/fonts/laz/SalesforceSans-Regular.woff') format('woff')
		}
	

	
	
		var isProduction = false;
		if(false){
			isProduction = true;
		}
		var initESW = function(gslbBaseURL) {
			embedded_svc.settings.displayHelpButton = false; //Or false
			embedded_svc.settings.language = ''; //For example, enter 'en' or 'en-US'

			//embedded_svc.settings.defaultMinimizedText = '...'; //(Defaults to Chat with an Expert)
			//embedded_svc.settings.disabledMinimizedText = '...'; //(Defaults to Agent Offline)

			//embedded_svc.settings.loadingText = ''; //(Defaults to Loading)
			//embedded_svc.settings.storageDomain = 'yourdomain.com'; //(Sets the domain for your deployment so that visitors can navigate subdomains during a chat session)

			// Settings for Live Agent
			//embedded_svc.settings.directToButtonRouting = function(prechatFormData) {
			// Dynamically changes the button ID based on what the visitor enters in the pre-chat form.
			// Returns a valid button ID.
			//};
			//embedded_svc.settings.prepopulatedPrechatFields = {}; //Sets the auto-population of pre-chat form fields
			//embedded_svc.settings.fallbackRouting = []; //An array of button IDs, user IDs, or userId_buttonId
			//embedded_svc.settings.offlineSupportMinimizedText = '...'; //(Defaults to Contact Us)

			embedded_svc.settings.enabledFeatures = ['LiveAgent'];
			embedded_svc.settings.entryFeature = 'LiveAgent';

			if(isProduction){
				embedded_svc.init(
						'https://learninga-z.my.salesforce.com',
						'https://lazcommunity.force.com/knowledgebase',
						gslbBaseURL,
						'00D300000000PUT',
						'LAZ_Default',
						{
							baseLiveAgentContentURL: 'https://c.la1-c1-iad.salesforceliveagent.com/content',
							deploymentId: '572f300000000N5',
							buttonId: '573f300000000Nj',
							baseLiveAgentURL: 'https://d.la1-c1-iad.salesforceliveagent.com/chat',
							eswLiveAgentDevName: 'EmbeddedServiceLiveAgent_Parent04If30000008OIAEA2_169e9fa3d0b',
							isOfflineSupportEnabled: false
						}
				);
			}
			else{
                embedded_svc.init(
                    'https://learninga-z--sandbox.cs123.my.salesforce.com',
                    'https://sandbox-lazcommunity.cs123.force.com/knowledgebase',
                    gslbBaseURL,
                    '00D3I0000004X6j',
                    'LAZ_Default',
                    {
                        baseLiveAgentContentURL: 'https://c.la1-c1cs-ia4.salesforceliveagent.com/content',
                        deploymentId: '572f300000000N5',
                        buttonId: '573f300000000Nj',
                        baseLiveAgentURL: 'https://d.la1-c1cs-ia4.salesforceliveagent.com/chat',
                        eswLiveAgentDevName: 'EmbeddedServiceLiveAgent_Parent04If30000008OIAEA2_169e9fa3d0b',
                        isOfflineSupportEnabled: false
                    }
                );
			}
		};

		if (!window.embedded_svc) {
			var s = document.createElement('script');

			if(isProduction){
				s.setAttribute('src', 'https://learninga-z.my.salesforce.com/embeddedservice/4.0/esw.min.js');
			}
			else{
				console.log('Non-production instance');
				s.setAttribute('src', 'https://learninga-z--sandbox.cs51.my.salesforce.com/embeddedservice/4.0/esw.min.js');
			}

			s.onload = function() {
				initESW(null);
			};
			//document.body.appendChild(s);
		} else {
			initESW('https://service.force.com');
		}
	
		
		
             
                
                    Your Contact Details
					
						Contact Email
					
					
						Email
						


















	
		
			
	

			
		
	

					
                    





	Contact Address


	First Name
	


















	
		
			
	

			
		
	



	Last Name
	


















	
		
			
	

			
		
	



	Street Address
	


















	
		
			
	

			
		
	



	


















	
		
			
	

			
		
	



	City
	


















	
		
			
	

			
		
	



	Zip/Postal Code
	


















	
		
			
	

			
		
	




	Country
	







	
		
			
		
			-- Select a Country --
			United StatesCanadaAfghanistanAland IslandsAlbaniaAlgeriaAmerican SamoaAndorraAngolaAnguillaAntarcticaAntigua and BarbudaArgentinaArmeniaArubaAustraliaAustriaAzerbaijanBahamasBahrainBangladeshBarbadosBelarusBelgiumBelizeBeninBermudaBhutanBoliviaBonaire, Sint Eustatius and SabaBosnia and HerzegovinaBotswanaBouvet IslandBrazilBritish Indian Ocean TerritoryBrunei DarussalamBulgariaBurkina FasoBurundiCambodiaCameroonCape VerdeCayman IslandsCentral African RepublicChadChileChinaChristmas IslandCocos (Keeling) islandsColombiaComorosCongoCongo, the Democratic Republic of theCook IslandsCosta RicaCote dIvoireCroatiaCuracaoCyprusCzech RepublicDenmarkDjiboutiDominicaDominican RepublicEcuadorEgyptEl SalvadorEquatorial GuineaEritreaEstoniaEthiopiaFalkland Islands (Malvinas)Faroe islandsFijiFinlandFranceFrench GuianaFrench PolynesiaFrench Southern TerritoriesGabonGambiaGeorgiaGermanyGhanaGibraltarGreeceGreenlandGrenadaGuadeloupeGuamGuatemalaGuernseyGuineaGuinea-BissauGuyanaHaitiHeard Island and McDonald IslandsHoly See (Vatican City State)HondurasHong KongHungaryIcelandIndiaIndonesiaIraqIrelandIsle of ManIsraelItalyJamaicaJapanJerseyJordanKazakstanKenyaKiribatiKorea, Republic ofKosovoKuwaitKyrgyzstanLao Peoples Democratic RepublicLatviaLebanonLesothoLiberiaLibyan Arab LamahiriyaLiechtensteinLithuaniaLuxembourgMacauMacedoniaMadagascarMalawiMalaysiaMaldivesMaliMaltaMarshall IslandsMartiniqueMauritaniaMauritiusMayotteMexicoMicronesia, Federated states ofMoldova, Republic ofMonacoMongoliaMontenegroMontserratMoroccoMozambiqueMyanmarNamibiaNauruNepalNetherlandsNew CaledoniaNew ZealandNicaraguaNigerNigeriaNiueNorfolk IslandNorthern Mariana IslandsNorwayOmanPakistanPalauPalestinian Territory, occupiedPanamaPapua New GuineaParaguayPeruPhilippinesPitcairnPolandPortugalPuerto RicoQatarReunionRomaniaRussian FederationRwandaSaint BarthelemySaint HelenaSaint Kitts and NevisSaint LuciaSaint Maarten (Dutch Part)Saint Martin (French Part)Saint Pierre and MiquelonSaint Vincent and the GrenadinesSamoaSan MarinoSao tome and PrincipeSaudi ArabiaSenegalSerbiaSeychellesSierra LeoneSingaporeSlovakiaSloveniaSolomon IslandsSomaliaSouth AfricaSouth Georgia and South Sandwich IslandsSouth SudanSpainSri LankaSurinameSvalbard and Lan MayenSwazilandSwedenSwitzerlandTaiwanTajikistanTanzania, United Republic ofThailandTimor-LesteTogoTokelauTongaTrinidad and TobagoTunisiaTurkeyTurkmenistanTurks and Caicos IslandsTuvaluUgandaUkraineUnited Arab EmiratesUnited KingdomUnited States Minor Outlying IslandsUruguayUzbekistanVanuatuViet NamVirgin Islands, BritishVirgin Islands, U.S.Wallis and FutunaWestern SaharaYemenZambiaZimbabweNo Country Selected
		
	
			
		
	




	State/Province
	







	
		
			
		
			-- Select a State or Province --
			AlabamaAlaskaArizonaArkansasArmed Forces AmericasArmed Forces EuropeArmed Forces PacificCaliforniaColoradoConnecticutDelawareDistrict of ColumbiaFloridaGeorgiaHawaiiIdahoIllinoisIndianaIowaKansasKentuckyLouisianaMaineMarylandMassachusettsMichiganMinnesotaMississippiMissouriMontanaNebraskaNevadaNew HampshireNew JerseyNew MexicoNew YorkNorth CarolinaNorth DakotaOhioOklahomaOregonPennsylvaniaRhode IslandSouth CarolinaSouth DakotaTennesseeTexasUtahVermontVirginiaWashingtonWest VirginiaWisconsinWyoming-- No State Or Province For My Location ---- State/Province Not On This List --
		
	
			
		
	





	Phone
	


















	
		
			
	

			
		
	




	(function($) {

		$(document).ready(function() {
			debouncedUpdate = _.debounce(updateSalesTax, 500);
			
			$('.tax-address').on('input blur change', debouncedUpdate);

			var $country = $('#country');
			$country.on('change', updateCountrySelect);
            clg.sssOrderOrganizationEdit.setCountryHasValue($country.val() &amp;&amp; $country.val() !== '0');

			$('#occupation').on('change', occupationUpdated);
			occupationUpdated();
		});
		
		var prevTaxAddress = {};
		
		function updateSalesTax() {
			var taxAddress = getTaxAddress();
			if(isCompleteTaxAddress(taxAddress) &amp;&amp; !isEqual(prevTaxAddress, taxAddress)) {
				$.ajax({
					type: 'put',
					url: '/accountsweb/sss/api/checkout/address.do',
					contentType: 'application/json',
					data: JSON.stringify(taxAddress),
					dataType: 'text html',
					success: function updateSalesTaxSuccess(data) {
						prevTaxAddress = taxAddress; 
						
						var html = $.parseHTML(data);
						var newSummaryHtml = $(html).find('.order-summary').html();
						
						$('.order-summary').html(newSummaryHtml);

                        var newTotalOrderPrice = $(html).find('.order-total-price').html();
                        $('.order-total-price').html(newTotalOrderPrice);
					}
				});
            }
        }

        function updateQuote() {
            var form = $('#orderForm');

            $.ajax({
                type: 'POST',
                url: '/accountsweb/sss/api/order/updateQuote.do',
                data: form.serialize(),
                cache: false,
                success: function() {
                    window.location.href = 'order.do';
                },
                error: redirectOnUnauthorized
            });
        }

        function updateCountrySelect() {
            var countryVal = $('#country').val();   
            if (countryVal.trim().length &lt; 1) {
                countryVal = &quot;0&quot;;
            }
            var url = '/accountsweb/account/getStatesForCountry.do?countryId=' + countryVal;
            new Ajax.Request(url, {
                method : 'get',
                asynchronous : false,
                onSuccess : function(transport) {
                    var jsonAr = JSON.parse(transport.responseText);
                    updateStatesOrgChanged($('#state'), jsonAr, '-- Select a State or Province --');
                    clg.sssMdrPicker.countryChanged();
                    clg.sssOrderOrganizationEdit.setCountryHasValue(countryVal &amp;&amp; countryVal !== '0');
                }
            });         
        }

        function updateStatesOrgChanged(select, newValues, nullLabel){
		    select.empty();
		    select.append('&lt;option value>' + nullLabel + '&lt;/option>');
		    newValues.forEach(function(newValue){
		       select.append('&lt;option value=&quot;' + newValue.id + '&quot;>' + newValue.name + '&lt;/option>');
            });
            return select;
        }

		function getTaxAddress() {
			return {
				street1 : $('#street1').val(),
				street2 : $('#street2').val(),
				city : $('#city').val(),
				postalCode : $('#zip').val(),
				regionCode : $('#state').val(),
				countryCode : $('#country').val()
			};
		}
		
		function isCompleteTaxAddress(address) {
			for(var i=0; i &lt; props.length; i++) {
				var prop = props[i];
				var value = address[prop];
				
				if(!value) return false;
			}
			
			return true;
		}
		
		function isEqual(obj1, obj2) {
			return rightContainsLeft(obj1, obj2) &amp;&amp;
				   rightContainsLeft(obj2, obj1);
		}
		
		function rightContainsLeft(rhs, lhs) {
			var prop, rhsVal, lhsVal;
			for(prop in rhs) {
				if(rhs.hasOwnProperty(prop)) {
					rhsVal = rhs[prop];
					lhsVal = lhs[prop];
					
					if(rhsVal !== lhsVal) {
						return false;
					}
				}
			}
			
			return true;
		}

        // if occupation changes and we have a edit button, enable/disable it
		function occupationUpdated(){
            var $organizationEdit = $('#organizationEdit');
            var $occupation = $('#occupation');

            var mdrIsDisabled = isMdrDisabled($occupation[0]) &amp;&amp; $organizationEdit[0];
            clg.sssOrderOrganizationEdit.setMdrDisabled(mdrIsDisabled);
        }
		
		var props = ['street1', 'city', 'postalCode', 'regionCode', 'countryCode'];
	})(jQuery);


                    
                        
                        
                            User Details
                        
                    
                
				
					
	Additional User Details



	
		
			Occupation
			







	
		
			
				
					Select
					Classroom TeacherPrincipal/Assistant PrincipalSpecialist Teacher/CoachSuperintendent/Assistant SuperintendentPurchasing/FinanceCurriculum DirectorCurriculum Specialist/CoordinatorEducational Technology DirectorEducational Technology Specialist/CoordinatorBilingual/ESL DirectorBilingual/ESL Specialist/CoordinatorSpecial Education DirectorSpecial Education Specialist/CoordinatorFederal Programs DirectorFederal Programs Specialist/CoordinatorCollege StudentCollege FacultyParent or Other Family MemberHomeschoolerOther Educator
				
			
			
		
	

		
		
	
	


	
		Your Organization

        
            
                
    
    
    
    
        
            Public
        
        
            Private
        
    
    
        State/Province
        







	
		
			
            -- Select a State or Province --AlabamaAlaskaArizonaArkansasArmed Forces AmericasArmed Forces EuropeArmed Forces PacificCaliforniaColoradoConnecticutDelawareDistrict of ColumbiaFloridaGeorgiaHawaiiIdahoIllinoisIndianaIowaKansasKentuckyLouisianaMaineMarylandMassachusettsMichiganMinnesotaMississippiMissouriMontanaNebraskaNevadaNew HampshireNew JerseyNew MexicoNew YorkNorth CarolinaNorth DakotaOhioOklahomaOregonPennsylvaniaRhode IslandSouth CarolinaSouth DakotaTennesseeTexasUtahVermontVirginiaWashingtonWest VirginiaWisconsinWyoming-- No State Or Province For My Location ---- State/Province Not On This List --
        
			
		
	

    
    
    
        District
        







	
		
			
            
                
                    
                    
                        
                        
                            getMdrOptions($('district'), &quot;&quot;, &quot;&quot;);
                        
                    
                
            -- Select a District --Alachua County School DistrictBaker County School DistrictBay County School DistrictBradford County School DistrictBrevard County School DistrictBrevard County Schools - ChoiceBrevard County Schools - ElementaryBrevard County Schools - SecondaryBroward County Public Charter SchoolsBroward County Public SchoolsCalhoun County School DistrictCharlotte County Public School DistrictCitrus County School DistrictClay County School DistrictCollier County Public School DistrictColumbia County School DistrictDeSoto County School DistrictDixie County School DistrictDuval County PSD - Elementary RegionDuval County PSD - High School Alternative RegionDuval County PSD - Middle SchoolsDuval County PSD - Turnaround SchoolDuval County Public School DistrictEscambia County School DistrictFDLRS - HillsboroughFlagler County School DistrictFlorida Department of EducationFlorida Diagnostic and Learning Resources System - Crown CenterFlorida Virtual School DistrictForida Diagnostic and Learning Resources System - ActionForida Diagnostic and Learning Resources System - Alpha CenterForida Diagnostic and Learning Resources System - East BrevardForida Diagnostic and Learning Resources System - GalaxyForida Diagnostic and Learning Resources System - GatewayForida Diagnostic and Learning Resources System - GulfcoastForida Diagnostic and Learning Resources System - HeartlandForida Diagnostic and Learning Resources System - Island CoastForida Diagnostic and Learning Resources System - MiccosukeeForida Diagnostic and Learning Resources System - NefecForida Diagnostic and Learning Resources System - ReachForida Diagnostic and Learning Resources System - SouthForida Diagnostic and Learning Resources System - SpringsForida Diagnostic and Learning Resources System - SuncoastForida Diagnostic and Learning Resources System - SunriseForida Diagnostic and Learning Resources System - WestgateFranklin County School DistrictGadsden County School DistrictGilchrist County School DistrictGlades County School DistrictGulf County School DistrictHamilton County School DistrictHardee County School DistrictHendry County School DistrictHernando County School DistrictHighlands County School DistrictHillsborough County Public School DistrictHillsborough County School District - AchievementHillsborough County School District - Area 1Hillsborough County School District - Area 2Hillsborough County School District - Area 3Hillsborough County School District - Area 4Hillsborough County School District - Area 5Holmes County School DistrictJackson County School DistrictJefferson County School DistrictLafayette County School DistrictLake County School DistrictLee County School DistrictLeon County School DistrictLevy County School DistrictLiberty County School DistrictMadison County School DistrictManatee County School DistrictMarion County Public SchoolsMartin County School DistrictMiami - Dade County Public School DistrictMiami-dade-central RegionMiami-dade-north RegionMiami-dade-south RegionMonroe County School DistrictNassau County School DistrictOkaloosa County School DistrictOkeechobee County School DistrictOrange County PSD - TransformationOrange County Public School DistrictOrange County Public School District - EastOrange County Public School District - High SchoolOrange County Public School District - InnovationOrange County Public School District - NorthOrange County Public School District - SoutheastOrange County Public School District - SouthwestOrange County Public School District - WestOsceola County School DistrictPalm Beach County School DistrictPalm Beach County School District - Central RegionPalm Beach County School District - Glades RegionPalm Beach County School District - North RegionPalm Beach County School District - South RegionPanhandle Area Education ConsortiumPasco County School DistrictPasco CSD - Elementary SchoolsPasco CSD - High SchoolsPasco CSD - Middle SchoolsPinellas County School - TransformationPinellas County School DistrictPinellas County Schools - Area 1Pinellas County Schools - Area 2Pinellas County Schools - Area 3Pinellas County Schools - Area 4Polk County School DistrictPolk County School District - Four Regions High SchoolPolk County School District - Four Regions Middle SchoolPolk County School District - Multiple PathwaysPolk County School District - NE &amp; SEPolk County School District - School ImprovementPolk County School District - W &amp; N CentralPutnam County School DistrictSanta Rosa County School DistrictSarasota County School DistrictSchool District of Indian River CountySeminole County Public School DistrictSt Johns County School DistrictSt Lucie County School DistrictSumter County School DistrictSuwannee County School DistrictTaylor County School DistrictUnion County School DistrictVolusia County School DistrictWakulla County School DistrictWalton County School DistrictWashington County School District-- District not in this list --
        
			
		
	

    
    
    
        School
        







	
		
			
            
                
                    
                    
                        
                        
                            getMdrOptions($('school'), &quot;&quot;, &quot;&quot;);
                        
                    
                
            -- Select a School ---- District --Barton Elementary SchoolBelvedere Elementary SchoolBenoist Farms Elementary SchoolBerkshire Elementary SchoolBinks Forest Elementary SchoolC O Taylor - Kirklane Elementary SchoolCholee Lake Elementary SchoolConniston Community Middle SchoolCrestwood Middle SchoolCypress Trails Elementary SchoolDiscovery Key Elementary SchoolEgret Lake Elementary SchoolElbridge Gale Elementary SchoolEmerald Cove Middle SchoolEquestrian Trails Elementary SchoolEverglades Elementary SchoolForest Hill Community High SchoolForest Hill Elementary SchoolGrassy Waters Elementary SchoolGreenacres Elementary SchoolH L Johnson Elementary SchoolHeritage Elementary SchoolHighland Elementary SchoolHope - Centennial Elementary SchoolIndian Ridge SchoolJohn I Leonard High SchoolLake Worth Community High SchoolLiberty Park Elementary SchoolLoxahatchee Groves Elementary SchoolMeadow Park Elementary SchoolMelaleuca Elementary SchoolNew Horizons Elementary SchoolNorth Grade Elementary SchoolPalm Beach Central High SchoolPalm Beach Public SchoolPalm Springs Elementary SchoolPalmetto Elementary SchoolPanther Run Elementary SchoolPine Jog Elementary SchoolPolo Park Middle SchoolRolling Green Elementary SchoolRoyal Palm Beach Community High SchoolRoyal Palm Beach Elementary SchoolSeminole Trails Elementary SchoolSouth Grade Elementary SchoolSouth Olive Elementary SchoolStarlight Cove Elementary SchoolU B Kinsey - Palmview Elementary SchoolWellington Community High SchoolWellington Elementary SchoolWellington Landings Middle SchoolWest Gate Elementary SchoolWynnebrook Elementary School-- School not in this list --
        
			
		
	

    



    School/Organization
    


















	
		
			
	

			
		
	



    
       clg.sssMdrPicker.init();
    

            
            
        
	


                    
                        
                            
                                Create User Login
                            
                            
                                Username
                                


















	
		
			
	

			
		
	

                            
                            
                                Password 
                                







	
		
			
                                    
                                
			
		
	

                            
                            
                                Re-Enter Password 
                                







	
		
			
                                    
                                
			
		
	

                            
                            
                            
                                Be the First to Know
                            
                            
                                
                                    
                                    Sign up to receive our eNews, updates, and offers.
                                
                            
                            You may unsubscribe at any time.
                        
                        
                            
                            
                                Payment Info
                            
                        
                    
                
                
                    




	Payment Method



	
	
		
		Credit Card
	
	
	
		
		Check/Money Order (Mail-In)
	
	
		
		Purchase Order (Fax)
	


	










	Billing Address


	
	
		Billing address is different from contact address
	


	
		
			First Name
			


















	
		
			
	

			
		
	

		
		
			Last Name
			


















	
		
			
	

			
		
	

		
		
			Street Address
			


















	
		
			
	

			
		
	

		
		
			


















	
		
			
	

			
		
	

		
		
			City
			


















	
		
			
	

			
		
	

		
		
			Test Zip/Postal Code
			
			


















	
		
			
	

			
		
	

            
		
        
            Country
            







	
		
			
                
                    -- Select a Country --
                    United StatesCanadaAfghanistanAland IslandsAlbaniaAlgeriaAmerican SamoaAndorraAngolaAnguillaAntarcticaAntigua and BarbudaArgentinaArmeniaArubaAustraliaAustriaAzerbaijanBahamasBahrainBangladeshBarbadosBelarusBelgiumBelizeBeninBermudaBhutanBoliviaBonaire, Sint Eustatius and SabaBosnia and HerzegovinaBotswanaBouvet IslandBrazilBritish Indian Ocean TerritoryBrunei DarussalamBulgariaBurkina FasoBurundiCambodiaCameroonCape VerdeCayman IslandsCentral African RepublicChadChileChinaChristmas IslandCocos (Keeling) islandsColombiaComorosCongoCongo, the Democratic Republic of theCook IslandsCosta RicaCote dIvoireCroatiaCuracaoCyprusCzech RepublicDenmarkDjiboutiDominicaDominican RepublicEcuadorEgyptEl SalvadorEquatorial GuineaEritreaEstoniaEthiopiaFalkland Islands (Malvinas)Faroe islandsFijiFinlandFranceFrench GuianaFrench PolynesiaFrench Southern TerritoriesGabonGambiaGeorgiaGermanyGhanaGibraltarGreeceGreenlandGrenadaGuadeloupeGuamGuatemalaGuernseyGuineaGuinea-BissauGuyanaHaitiHeard Island and McDonald IslandsHoly See (Vatican City State)HondurasHong KongHungaryIcelandIndiaIndonesiaIraqIrelandIsle of ManIsraelItalyJamaicaJapanJerseyJordanKazakstanKenyaKiribatiKorea, Republic ofKosovoKuwaitKyrgyzstanLao Peoples Democratic RepublicLatviaLebanonLesothoLiberiaLibyan Arab LamahiriyaLiechtensteinLithuaniaLuxembourgMacauMacedoniaMadagascarMalawiMalaysiaMaldivesMaliMaltaMarshall IslandsMartiniqueMauritaniaMauritiusMayotteMexicoMicronesia, Federated states ofMoldova, Republic ofMonacoMongoliaMontenegroMontserratMoroccoMozambiqueMyanmarNamibiaNauruNepalNetherlandsNew CaledoniaNew ZealandNicaraguaNigerNigeriaNiueNorfolk IslandNorthern Mariana IslandsNorwayOmanPakistanPalauPalestinian Territory, occupiedPanamaPapua New GuineaParaguayPeruPhilippinesPitcairnPolandPortugalPuerto RicoQatarReunionRomaniaRussian FederationRwandaSaint BarthelemySaint HelenaSaint Kitts and NevisSaint LuciaSaint Maarten (Dutch Part)Saint Martin (French Part)Saint Pierre and MiquelonSaint Vincent and the GrenadinesSamoaSan MarinoSao tome and PrincipeSaudi ArabiaSenegalSerbiaSeychellesSierra LeoneSingaporeSlovakiaSloveniaSolomon IslandsSomaliaSouth AfricaSouth Georgia and South Sandwich IslandsSouth SudanSpainSri LankaSurinameSvalbard and Lan MayenSwazilandSwedenSwitzerlandTaiwanTajikistanTanzania, United Republic ofThailandTimor-LesteTogoTokelauTongaTrinidad and TobagoTunisiaTurkeyTurkmenistanTurks and Caicos IslandsTuvaluUgandaUkraineUnited Arab EmiratesUnited KingdomUnited States Minor Outlying IslandsUruguayUzbekistanVanuatuViet NamVirgin Islands, BritishVirgin Islands, U.S.Wallis and FutunaWestern SaharaYemenZambiaZimbabweNo Country Selected
                
            
			
		
	

        
		
			State/Province
			







	
		
			
				
					-- Select a State or Province --
					AlabamaAlaskaArizonaArkansasArmed Forces AmericasArmed Forces EuropeArmed Forces PacificCaliforniaColoradoConnecticutDelawareDistrict of ColumbiaFloridaGeorgiaHawaiiIdahoIllinoisIndianaIowaKansasKentuckyLouisianaMaineMarylandMassachusettsMichiganMinnesotaMississippiMissouriMontanaNebraskaNevadaNew HampshireNew JerseyNew MexicoNew YorkNorth CarolinaNorth DakotaOhioOklahomaOregonPennsylvaniaRhode IslandSouth CarolinaSouth DakotaTennesseeTexasUtahVermontVirginiaWashingtonWest VirginiaWisconsinWyoming-- No State Or Province For My Location ---- State/Province Not On This List --
				
			
			
		
	

		
		
		
			Email
			


















	
		
			
	

			
		
	

		
		
			Phone
			


















	
		
			
	

			
		
	

		
	


	(function($) {
		$(document).ready(function() {
			$('.billing-contact-checkbox').on('change', function() {
				var $this = $(this);
				
				var checked = $this.prop('checked');
				var billingContactInfo = $('#billing-contact-info');
				
				checked ? billingContactInfo.show() : billingContactInfo.hide();
			});
		});
	})(jQuery);

	
	
		Credit Card Info
	
	
		Card Number
		


















	
		
			
	

			
		
	

	
	
		Card Type
		







	
		
			
			









	VisaMasterCardAmerican Express

		
			
		
	

	
	
		Exp Month
		







	
		
			
			









	010203040506070809101112

		
			
		
	

	
	
		Exp Year
		







	
		
			
			









	212223242526272829303132

		
			
		
	

	
	
		Security Code 
			
				(what's this?)
				
					Visa/MasterCard: The Security Code is the 3-digit number on
					the back of your MasterCard or Visa card. It is the last 3
					digits AFTER the credit card number in the signature area of
					the card. 
					American Express: The Security Code is a 4-digit
					number printed on the front of your American Express card. It
					appears AFTER and to the RIGHT of your card number.
					
				
	       
       
       







	
		
			
			
		
			
		
	

	


	(function($) {
		$(document).ready(function() {
            $('.payment-type-radiobutton').attr(&quot;autocomplete&quot;, &quot;off&quot;);
            
			$('.payment-type-radiobutton').on('change', function() {
				var $this = $(this);
				
				var checked = $this.prop('checked');
				var value = $this.val();
				
				var $orderButton = $('#order-button');
				var $orderSummaryButton = $('#order-summary-order-button');
				var $orderText = $('#order-type-text');
				var $creditCardInfo = $('#credit-card-info');
				
				if(checked &amp;&amp; value === 'CC') {
					$orderButton.text('COMPLETE ORDER');
					$orderSummaryButton.text('COMPLETE ORDER');
					$orderText.text('Complete Order');
					$creditCardInfo.show();
				}
				else {
					$orderButton.text('GENERATE QUOTE');
					$orderSummaryButton.text('GENERATE QUOTE');
					$orderText.text('Generate Quote');
					$creditCardInfo.hide();
				}
			});
		});
	})(jQuery);

                    
                    
                        By clicking
                        
                            
                                Complete Order
                                
                            
                        ​,​ I agree to the Terms of Service, Usage Policy, Privacy Policy,​and the total amount of $118.00 USD


                        
                    
                    
                        
                        I understand that to complete my order, I need to respond to a verification email and provide permission for my students to use Learning A-Z online learning tools.
                    
                    
                    
                        
                            
                                COMPLETE ORDER
                                
                            
                        
                        Cancel Order
                    
                
			
		
		
			
		





Order Summary

	
		
			Product
			No. Of Lic
			Term
			 
			Unit Price
			Total
		
	
	
		
			
		
		
			
				
					
						
							Raz-Kids
							(new)
						
						1x
						





12/06/2022
						
							
							 
						
						$118.00
						$118.00
					
				
				
				
					
				
				
				
					Subtotal
					 
					
						$118.00
					
				
				
				
					
						
							Sales Tax
							 
							
								$0.00
							
						
						
					
				
			
			
		
		
			
		
		
		
			
			
				
					
						Total (USD)
					
					 
					
						
							$118.00
						
					
				
			
		
		
	

	
            
                
                    Change Order
                    
                        
                            COMPLETE ORDER
                            
                        
                    
                
            
		
		
		

	
        
        



    </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;container&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='container']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Contact'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='/'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div[3]</value>
   </webElementXpaths>
</WebElementEntity>
