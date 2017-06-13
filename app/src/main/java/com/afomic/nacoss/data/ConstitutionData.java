package com.afomic.nacoss.data;

import android.text.Html;

import com.afomic.nacoss.model.Constitution;

import java.util.ArrayList;

/**
 * Created by afomic on 18-Oct-16.
 *
 */
public class ConstitutionData {
    ArrayList<Constitution> article1,article2,article3,article4,article5,article6,article7;
    ArrayList[] articles={article1,article2,article3,article4,article5,article6,article7};
    private static ConstitutionData data;
    public static ConstitutionData get(){
        if(data==null){
            data=new ConstitutionData();
        }
        return data;
    }

    private ConstitutionData(){
        article1=new ArrayList<>();
        article2=new ArrayList<>();
        article3=new ArrayList<>();
        article4=new ArrayList<>();
        article5=new ArrayList<>();
        article6=new ArrayList<>();
        article7=new ArrayList<>();
        addData();
    }

    public void addData(){
        article1.add(new Constitution(0,0,"Name and Status"," <font color=\"#0033CC\">Subsections:</font>" +
                "<p> <font color=\"#0033CC\">NAME</font>: The Association shall be known and addressed as the Nigerian Association of Computer Science Students herein and hereafter referred to as NACOSS “THE ASSOCIATION”.</p>" +
                "<p><font color=\"#0033CC\">STATUS</font>: NACOSS is a non-governmental association. It is the only official representative body of all Computer Science and Engineering Students in Obafemi Awolowo University (O.A.U)," +
                " and its members referred to as NACOSSITES.</p>"));
        article1.add(new Constitution(0,1,"Supremacy","<font color=\"#0033CC\">Subsections:</font>" +
                "<p><font color=\"#0033CC\">1.</font>The Constitution is supreme and its provisions shall be binding on all members of THE ASSOCIATION.</p>" +
                "<P><font color=\"#0033CC\">2.</font>The Association shall not be governed nor shall any person or group of persons take over the administration/control of The Association or any of its organs except in accordance with the provisions of The Constitution.</p>" +
                "<P><font color=\"#0033CC\">3.</font>If any other law(s) within NACOSS is inconsistent with the provisions of The Constitution, The Constitution shall prevail and that (those)" +
                " law(s) shall to the extent of their inconsistency be null, void and of no effect whatsoever.</p>"));
        article1.add(new Constitution(0,2,"Aims And Objectives","<font color=\"#0033CC\">Subsections:</font>" +
                "<P><font color=\"#0033CC\">1.</font>To cater for the general welfare, interest and defend the rights of all members of The Association.</p>" +
                "<P><font color=\"#0033CC\">2.</font>To serve as a forum of interaction and promotion of unity among members.</p>" +
                "<P><font color=\"#0033CC\">3.</font>To provide a forum for interaction of members of The Association with governmental, non-governmental and other student bodies within and outside the University community.</p>" +
                "<P><font color=\"#0033CC\">4.</font>To project the image of The Association on National and International scene.</p>" +
                "<P><font color=\"#0033CC\">5.</font>To contribute immensely towards the improvement of the Information and Communication Technology Knowledge of the community.</p>"));
        article1.add(new Constitution(0,3,"CLASS OF MEMBERSHIP AND STRUCTURE","<font color=\"#0033CC\">Subsections:</font>"
                +"<P><font color=\"#0033CC\">1.</font>CLASS OF MEMBERSHIP</p>" +
                "(a.)  ORDINARY MEMBERS<br>" +
                "An ordinary member must have been admitted and has registered in the Department of Computer Science and Engineering with the award of B. Sc in view.<br>" +
                "(b.) HONORARY MEMBERS<br>" +
                "Honorary membership shall be granted by the Computer Student Representative Council (CSRC) only to person(s) who have greatly contributed to the achievement of the aims and objectives of The Association. The recommendation could also be at the instance of the Executive Council (EC) to the Computer Student Representative Council (CSRC).<br>" +
                "(c.) LIFE MEMBERS<br>" +
                "Life membership shall be granted to past members of The Association appointed by the CSRC to the Hall of Fame of the Association due to their past activities in the interest of the association.<br>" +
                "(d.) FINANCIAL MEMBERS<br>" +
                "Financial members shall be Ordinary Members, who must have paid their association due, i.e. “NACOSS DUE”.<br>" +
                "<P><font color=\"#0033CC\">2.</font> RIGHTS AND PRIVILEGES OF MEMBERS</p>" +
                "(a.)  No person(s), who having satisfied the provisions of section 4, subsection 1(a) of The Constitution shall be denied membership on ground of GENDER, RELIGION, HEALTH, ETHNICITY, RACE or IDEOLOGY.<br>" +
                "(b.) Financial members shall obtain on first registration, a copy of The Association’s Constitution.<br>" +
                "(c.) Ordinary Members shall have the right to use the facilities provided and be recognized by The Association.<br>" +
                "(d.) Members shall have the right to attend and voice views in any congress.<br>" +
                "(e.) Members shall have the privilege to participate in recognized meetings and foundations of The Association.<br>" +
                "(f.)  Financial members shall have the right to vote and be voted for in any approved elections of The Association.<br>" +
                "(g.) Members shall have a right to fair hearing if any allegation is leveled against them.<br>"));
        article1.add(new Constitution(0,4,"TERMINATION OF MEMBERSHIP","<font color=\"#0033CC\">Subsections:</font> " +"<P><font color=\"#0033CC\">1.</font>Ordinary Membership shall lapse on ceasing to be a registered student of the Computer Science and Engineering Department.</p>" +
                "<P><font color=\"#0033CC\">2.</font>The CSRC shall have the right to terminate the membership of any member(s) as it deems fit.</p>"));
        article1.add(new Constitution(0,5,"PATRONS","<font color=\"#0033CC\">Subsections:</font> " +"<P><font color=\"#0033CC\">1.</font>The patrons of The Association shall include:</p>" +
                "(a.)  The Head of Computer Science and Engineering Department as the grand patron, whose appointment shall terminate at the end of his/her tenure as HOD.<br>" +
                "(b.) Individuals from all works of life nominated by the EC and approved by a simple majority of CSRC delegates present at the CSRC sitting.<br>" +
                "<P><font color=\"#0033CC\">2.</font>The appointment of a patron shall stand terminated after the expiration of two years.</p>" +
                "<P><font color=\"#0033CC\">3.</font>The appointment of the patron shall also stand terminated if he dies or resigns before the expiration of the two year duration.</p>" +
                "<P><font color=\"#0033CC\">4.</font>The CSRC shall have the right to terminate the membership of any patron as it deem fit.</p>"));
        article1.add(new Constitution(0,6,"STAFF ADVISERS","<font color=\"#0033CC\">Subsections:</font> " +"<P><font color=\"#0033CC\">1.</font>The CSRC shall appoint from time to time, staff Advisers from among the members of staff of Computer Science and Engineering Department.</p>" +
                "<P><font color=\"#0033CC\">2.</font>For the purpose of section 7, subsection 1</p>" +
                "(a.)  A member of the CSCRC shall purpose any member of staff of the Department as an Adviser.<br>" +
                "(b.) A member of staff shall be deemed to have been appointed a staff adviser by a vote of not less than two thirds (2/3) vote of the members of the CSRC.<br>" +
                "<P><font color=\"#0033CC\">3.</font>The appointment of a staff adviser shall stand except for the following reasons</p> " +
                "(a.)  The appointment of the staff adviser shall stand for a period of four years after which he/she could be reappointed again for another term.<br>" +
                "(b.) If he/she resigns his appointment as a member of staff of the Computer Science and Engineering Department.<br>" +
                "(c.) If he/she dies while holding office.<br>" +
                "(d.) The CSRC shall have the right to terminate the appointment of any staff adviser(s) as it deem fit.<br>"));
       //section 2
        article2.add(new Constitution(1,0," ACCEPTANCE","No member shall be absolved from the observation of this constitution on the plea that he is ignorant of this constitution."));
        article2.add(new Constitution(1,1,"INTERPRETATION","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>The power of the ultimate interpretation of the constitution shall rest with the President of The Association, except during the CSRC sitting when such powers shall rest with the speaker of the CSRC.</p>" +
                "<P><font color=\"#0033CC\">2.</font>Such interpretation shall be reversible by at least two-third (2/3) majority of the EC during their meeting or the delegates of CSRC present at CSRC Sitting Assembly and Voting.</p>" +
                "<P><font color=\"#0033CC\">3.</font>In situation where there are contradiction between the EC and CSRC, the CSRC interpretation takes precedence over the EC.</p>" +
                "<P><font color=\"#0033CC\">4.</font>In this constitution, unless it is otherwise expressly stated or requested by contest, all masculine pronouns include feminine.</p>" +
                "<P><font color=\"#0033CC\">5.</font>Officers of The Association include any student serving The Association as a result of election or appointment in one official capacity or the other.</p>" +
                "<P><font color=\"#0033CC\">6.</font>All Association elections shall hold in accordance with the provisions of the constitution.</p>" +
                "<P><font color=\"#0033CC\">7.</font>Constituency shall refer to any population unit of student in a particular year of study.</p>" +
                "<P><font color=\"#0033CC\">8.</font>Present and voting refers to every member of the EC, the CSRC or the congress as the case may be, present at the meeting of the aforementioned, and exercising his voting rights.</p>"));
        article2.add(new Constitution(1,2,"AMENDMENT","<font color=\"#0033CC\"/>Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>The constitution may be amended upon a resolution to do so, brought before the congress by member(s) and passed by four-fifth (4/5) of members present and voting at such congress.</p>" +
                "<P><font color=\"#0033CC\">2.</font>A rest motion for the amendment of the constitution may be sponsored by any member of CSRC and supported by at least four-fifth (4/5) majority of CSRC members present at that sitting provided they form a quorum at such sittings.</p>" +
                "<P><font color=\"#0033CC\">3.</font>Such a motion or a resolution by the congress shall on adoption be sent to the constitution review committee which shall deliberate on and recommend the amendment.</p>" +
                "<P><font color=\"#0033CC\">4.</font>The final draft of the amended constitution shall be sent to the CSRC for debate and final ratification.</p>"));
        article2.add(new Constitution(1,3,"SUSPENSION","A section of this constitution may be suspended by at least 4/5 majority of the CSRC members present and voting."));
        //article 3
        article3.add(new Constitution(2,0,"EXTENT OF EXECUTIVE POWER","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>The executive power of The Association is hereby rested in the EC. Such power is subject to the provision of the constitution and shall be exercised by them directly.</p>" +
                "<P><font color=\"#0033CC\">2.</font>The executive power shall also include upholding the sanctity of the constitution.</p>" +
                "<P><font color=\"#0033CC\">3.</font>If the EC comes to the conclusion that an executive member does not fulfill his duties, it can decide to recommend the CSRC to remove or suspend the officer.</p>"));
        article3.add(new Constitution(2,1,"TENURE OF OFFICE","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>A term of office shall extend from the day of swearing-in of an EC to the day of another.</p>" +
                "<P><font color=\"#0033CC\">2.</font>No student shall serve more than one term in the same executive office.</p>"));
        article3.add(new Constitution(2,2,"COMPOSITION OF THE EXECUTIVE","The Executive council shall compose of:<br>" +
                "i The President<br>" +
                "ii. The Vice President<br>" +
                "iii. The General Secretary<br>" +
                "iv. The Assistant General Secretary<br>" +
                "v. The Public Relation Officer<br>" +
                "vi  The Financial Secretary<br>" +
                "vii. The Director of Socials<br>" +
                "viii. The Director of Sports<br>" +
                "ix. The Librarian<br>" +
                "x. The Assistant Librarian<br>"));
        article3.add(new Constitution(2,3,"FUNCTIONS OF THE EC","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>THE PRESIDENT</p>" +
                "(a.)  Shall be the Head and first member of The Association.<br>" +
                "(b.) Shall at all time uphold the constitution.<br>" +
                "(c.)  Shall coordinate the activities of other executive and principal officers and shall designate other function to any member whenever the need arises.<br>" +
                "(d.) Shall summon all executive meetings and congresses in consultation with the General Secretary and preside over these meetings and congresses.<br>" +
                "(e.) If the president fails in his function is subsection 1(d) above, two third (2/3) majority of the executive members can summon a meeting.<br>" +
                "(f.) Shall initiate actions within his powers to the best interest of The Association subject to the approval of the Executive and the CSRC.<br>" +
                "(g.) Any decision taken by the President at Executive meetings may be reversible by at least two-third (2/3) majority of the members present by voting.<br>" +
                "(h.) He shall have a casting vote in Executive and congress meetings, only if there is a tie.<br>" +
                "(i.) The President may be a signatory in all financial matters.<br>" +
                "(j.) The President may take decisions where due consultation is not possible, provided he can offer satisfactory explanation to the EC and CSRC  as the case may be , otherwise, he shall bear responsibility of the consequences of such decision.<br>" +
                "(k.) He shall be in charge of Registration and Renewal of Association and can saddle the responsibility on any NACOSSITE of his choice.<br>" +
                "(l.) He shall perform other functions that may be assigned to him by the EC, CSRC or the congress.<br>" +
                "<P><font color=\"#0033CC\">2.</font>THE VICE PRESIDENT</p>" +
                "(a.)  Shall act in the absence of the President and in discharge of his duty, act on the advice of the EC.<br>" +
                "(b.) He shall be responsible for the organization and execution of orientation program for fresh men.<br>" +
                "(c.) He shall be responsible for matters relating to the academic welfare of the members of The Association.<br>" +
                "(d.) He shall be the chairman of the academic committee.<br>" +
                "(e.) He shall perform other functions that may be assigned to him by the EC, CSRC or the congress.<br>" +
                "<P><font color=\"#0033CC\">3.</font>THE GENERAL SECRETARY</p>" +
                "(a.)  Shall be responsible for all correspondence of The Association and keep proper records of such correspondence.<br>" +
                "(b.) Shall take minutes at Executive meetings and Congresses.<br>" +
                "(c.) He shall together with the President be responsible for all the liaison affairs of The Association.<br>" +
                "(d.) Shall under the directives of the President summon all meetings of the EC.<br>" +
                "(e.) Shall prepare a report of The Associations’ activities and present such to the CSRC just before the end of a parliamentary year or when requested by the CSRC.<br>" +
                "(f.) Shall coordinate the proper handling of The Associations’ property from an outgoing executive to an incoming executive.<br>" +
                "(g.) May be a signatory to The Association Accounts.<br>" +
                "(h.) Shall perform any other duties as may be directed by the President, EC, CSRC or congress.<br>" +
                "<P><font color=\"#0033CC\">4.</font>THE ASSISTANT GENERAL SECRETARY</p>" +
                "(a.)  Shall assist the General Secretary in the discharge of his duties and shall act for him in his absence.<br>" +
                "(b.) Shall perform any other duties as may be directed by the President, EC, CSRC or congress.<br>" +
                "(c.) Shall take stock of The Associations’ property at the beginning of the tenure and shall send a copy of such to the CSRC.<br>" +
                "<P><font color=\"#0033CC\">5.</font>THE PUBLIC RELATIONS OFFICER</p>" +
                "(a.)  Shall publicize the activities of The Association within and outside the University Community.<br>" +
                "(b.) Shall in conjunction with the General Secretary notify Members of the EC, and NACOSSITES of Executive meetings and congresses.<br>" +
                "(c.) Shall Head the Editorial board committee of The Association.<br>" +
                "(d.) Shall perform any other duties as may be directed by the President, EC, CSRC or Congress. <br>" +
                "(e.) Shall make available to the library all publicity work for record purposes.<br>" +
                "<P><font color=\"#0033CC\">6.</font>THE FINANCIAL SECRETARY</p>" +
                "(a.)  Shall keep proper financial account of The Association.<br>" +
                "(b.) Shall coordinate the collection of annual dues, donations and any other dues.<br>" +
                "(c.) Shall be responsible for ensuring that all money collected in the name of The Association is properly accounted for.<br>" +
                "(d.) Shall prepare and present to the CSRC/congress at the end of his tenure or upon request, a report which must include a detailed statement of the financial transactions of The Association.<br>" +
                "(e.) May be a signatory to all The Associations’ Account.<br>" +
                "(f.) Shall ensure that all money spent are duly authorized and for the office concerned.<br>" +
                "(g.) Shall perform any other duties as may be directed by the President, EC, CSRC or congress.<br>" +
                "(h.) Shall keep all The Associations money in The Associations’ account when not required, but may have an impress amount of not more than #1000.00.<br>" +
                "<P><font color=\"#0033CC\">7.</font>THE DIRECTOR OF SOCIALS</p>" +
                "(a.)  Shall be responsible for all the social activities The Association may likely hold within the period of his term in office.<br>" +
                "(b.) Shall be the chairman of Social committee (where such exists).<br>" +
                "(c.) Shall discharge all other duties assigned to him by the EC, CSRC, and congress.<br>" +
                "<P><font color=\"#0033CC\">8.</font>THE DIRECTOR OF SPORTS</p>" +
                "(a.)  Shall be responsible for coordinating all sporting activities of The Association.<br>" +
                "(b.) Shall be the chairman of Sports committee (where such exists).<br>" +
                "(c.) Shall keep all sporting equipment.<br>" +
                "(d.) Shall be financially liable for any mismanagement of sport fund.<br>" +
                "(e.) Shall organize at least one inter-class competition during his tenure in office.<br>" +
                "(f.) Shall represent The Association in the University sport meetings.<br>" +
                "(g.) Shall discharge all other duties assigned to him by the EC, CSRC and congress.<br>" +
                "<P><font color=\"#0033CC\">9.</font>THE LIBRARIAN</p>" +
                "(a.)  Shall be custodian of the Library and the properties contained therein. <br>" +
                "(b.) Shall on assumption of office keep an inventory of the stock in the Library and send such copies to the CSRC.<br>" +
                "(c.) Shall at all times ensure decorum, cleanliness and orderliness in the Library.<br>" +
                "(d.) Shall be responsible for ensuring that new books are procured for the Library.<br>" +
                "(e.) Shall assist the Vice President on Academic matters.<br>" +
                "(f.) Shall ensure that the Library is opened at agreed period by the EC or as stipulated by the CSRC or congress.<br>" +
                "(g.) Shall perform other functions as directed by the EC, CSRC and Congress.<br>" +
                "(h.) Shall employ lawful means to request for journals, books of professional institutions and readings from workshops and seminars both within and outside the University Community to enrich the knowledge of members of The Association.<br>" +
                "<P><font color=\"#0033CC\">10.</font>THE ASSISTANT LIBRARIAN</p>" +
                "(a.)  Shall assist the Librarian and act in full capacity in his absence.<br>" +
                "(b.) Shall keep a supervisory watch on the Library.<br>" +
                "(c.) Shall perform other functions as directed by the EC, CSRC and Congress.<br>"));
        article3.add(new Constitution(2,4,"Collective Responsibilities","<p><font color=\"#0033CC\">1.</font>The EC shall function as a single coordinated body at all time.</p>" +
                "<P><font color=\"#0033CC\">2.</font>Any member of the EC or the entire Executive may be collectively held responsible for the action(s) of any Executive Officer.</p>" +
                "<P><font color=\"#0033CC\">3.</font>The entire members of the EC shall perform functions as may be assigned to them by the President, EC, CSRC and Congress.</p>" +
                "<P><font color=\"#0033CC\">4.</font>The EC meetings shall be convened by the President or a written request of two-third (2/3) majority of members of the EC.</p>" +
                "<P><font color=\"#0033CC\">5.</font>Fund raising shall be a collective responsibility of all Executive members but coordinated by the President closely assisted by the Financial Secretary.</p>" +
                "<P><font color=\"#0033CC\">6.</font>No Ad-hoc committees shall be constituted by the President without the approval of the CSRC or Congress.</p>" +
                "<P><font color=\"#0033CC\">7.</font>A budget must be presented not later than 2 weeks from assumption of office to the CSRC for ratification.</p>" +
                "<P><font color=\"#0033CC\">8.</font>The presented budget must cater for the welcoming of the incoming freshers and the electoral committee.</p>" +
                "<P><font color=\"#0033CC\">9.</font>Each executive member shall present and defend his budget in person.</p>"));
        article3.add(new Constitution(2,5,"DISCIPLINARY ACTION","<p><font color=\"#0033CC\">1.</font>If any EC member is  lagging behind in his/her duties</p>" +
                "<P><font color=\"#0033CC\">2.</font>If there is any case of misappropriation of funds</p>" +
                "<P><font color=\"#0033CC\">3.</font>If there is a petition against any member of EC, with at least 20 signatures across at least 4 constituencies" +
                "There shall be a panel set up by the CSRC, to investigate due punishments ranging from suspension to expulsion from office or otherwise, decided by the committee.</p>"));
        //article four
        article4.add(new Constitution(3,0,"Functions and Powers of the CSRC","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>The legislative powers of The Association shall be vested in the Computer Students Representative Council referred to as CSRC.</p>" +
                "<P><font color=\"#0033CC\">2.</font>The CSRC shall represent the general interest of The Association and all NACOSSITES.</p>" +
                "<P><font color=\"#0033CC\">3.</font>The CSRC shall be responsible for forming all Ad-Hoc committee and appoint the chairman of such committees as may deem fit except otherwise stated in other parts of the constitution.</p>" +
                "<P><font color=\"#0033CC\">4.</font>Such committees are directly responsible to the CSRC.</p>" +
                "<P><font color=\"#0033CC\">5.</font>Shall have powers to criticize, scrutinize, ratify, amend or reject the proposals of the EC.</p>" +
                "<P><font color=\"#0033CC\">6.</font>Such proposal in subsection 5 shall be presented to the CSRC not later than two (2) weeks from the beginning of his tenure of office, for necessary approval and amendment.</p>" +
                "<P><font color=\"#0033CC\">7.</font>In rare situation, where the Executive Council has been in power for more than 2 weeks earlier than the CSRC, it shall scrutinize the budget at its first sitting after the election of the CSRC officers.</p>" +
                "<P><font color=\"#0033CC\">8.</font>The CSRC shall consider granting the use of extra funds required by any officer of the EC after due request to the CSRC.</p>" +
                "<P><font color=\"#0033CC\">9.</font>The CSRC shall have the right to petition and review any program of the EC as it deems fit.</p>" +
                "<P><font color=\"#0033CC\">10.</font>The CSRC shall make public the adopted resolution of its sittings through the Clerk of The House within 24 hours of such adoption.</p>" +
                "<P><font color=\"#0033CC\">11.</font>The CSRC shall also have the right to call a congress in order to determine any matters relevant to The Association.</p>" +
                "<P><font color=\"#0033CC\">12.</font>The decisions of the CSRC shall remain valid unless contrary decisions are made at a Congress.</p>" +
                "<P><font color=\"#0033CC\">13.</font>The CSRC shall have the power to remove, suspend and discipline EC/CSRC member with at least two-third (2/3) of CSRC member present.</p>" +
                "<P><font color=\"#0033CC\">14.</font>Shall have power to elect any of its principal officers.</p>"));
        article4.add(new Constitution(3,1,"Tenure of office","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>The CSRC shall function for one parliamentary year and shall stand dissolved thereafter.</p>" +
                "<P><font color=\"#0033CC\">2.</font>A parliamentary year shall extend from the day of swearing-in of a CSRC to the day of another.</p>" +
                "<P><font color=\"#0033CC\">3.</font>Such dissolution shall be done at the last parliamentary sitting before the swearing-in ceremony of the new CSRC.</p>"));
        article4.add(new Constitution(3,2,"COMPOSITION OF THE CSRC","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>The CSRC shall be composed of five (5) elected students from each year of study.</p>" +
                "<P><font color=\"#0033CC\">2.</font>Officers of the CSRC shall include: The Speaker, The Deputy Speaker, The Chief Whip and The Clerk of The House.</p>" +
                "<P><font color=\"#0033CC\">3.</font>Officers of the CSRC shall be elected at the swearing-in conducted by the chairman of the Electoral Council.</p>" +
                "<P><font color=\"#0033CC\">4.</font>The CSRC shall not consist of member of the EC.</p>"));
        article4.add(new Constitution(3,3,"OFFICERS OF THE CSRC","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>THE SPEAKER</p>" +
                "(a.)  The Speaker must be from PART V constituency<br>" +
                "(b.) The Speaker shall be responsible for calling the sittings of the CSRC through the Clerk of The House.<br>" +
                "(c.) The Speaker shall preside at all sittings of the CSRC except otherwise stated in any part of the constitution.<br>" +
                "(d.) He shall be obliged to summon meetings of the CSRC when called upon to or so by at least two-thirds (2/3) of the members of the House appending their signatures to such calls and when he fails to summon the sitting within 72 hours of receiving such a call, the sitting shall stand convened and The Speaker stands to be impeached.<br>" +
                "(e.) The decision of The Speaker may be reversed by a two-third (2/3) vote of the CSRC members present.<br>" +
                "(f.) The Speaker can only exercise a casting voting right only if there is a tie.<br>" +
                "<P><font color=\"#0033CC\">2.</font>THE DEPUTY SPEAKER</p>" +
                "(a.)  The Deputy Speaker shall be from PART III or V Constituency.<br>" +
                "(b.) Shall assist The Speaker from time to time in the discharge of his duties and perform all his duties in his absence.<br>" +
                "(c.) In the absence of the Deputy Speaker at any sitting of the CSRC, another member of the CSRC may be appointed to perform the function for the purpose of such sittings only.<br>" +
                "(d.) In line with section 4, subsection 2(b), He must not have a casting vote at any elections in such function.<br>" +
                "(e.) He shall be responsible for conducting election within the CSRC sitting.<br>" +
                "(f.) Shall oversee the affair of the Ad-Hoc committee setup by the CSRC.<br>" +
                "<P><font color=\"#0033CC\">3.</font>THE CLERK OF THE HOUSE</p>" +
                "(a.)  The Clerk must be from PART II, III or V Constituency.<br>" +
                "(b.) He shall take and keep a record of attendance at all CSRC sitting.<br>" +
                "(c.) Shall be responsible for taking proper minutes at CSRC sitting.<br>" +
                "(d.) May be summoned to give summary of previous CSRC sitting(s);<br>" +
                "(e.) Shall summon all sittings of the CSRC on the instruction of The Speaker.<br>" +
                "(f.) Shall prepare, in advance, the agenda of all CSRC sitting as directed by The Speaker and publicize them as appropriate.<br>" +
                "(g.) Shall publicize all adopted resolution of the CSRC sittings within 24 hours of such resolution.<br>" +
                "(h.) Shall keep proper financial records of The House.<br>" +
                "(i.) Shall be responsible for compilation of proceedings of The House for the parliamentary year for proper documentation.<br>" +
                "<P><font color=\"#0033CC\">4.</font>THE CHIEF WHIP</p>" +
                "(a.)  The Chief Whip can be from any Constituency.<br>" +
                "(b.) Shall maintain orderliness, decorum and discipline in The House.<br>" +
                "(c.) Shall in due consultation with The Speaker send out any member or observer who in his opinion, has misconduct himself through persistent disregard to the rule of The House.</p>"));
        article4.add(new Constitution(3,4,"SITTINGS OF THE CSRC","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>The first sitting of the CSRC shall hold immediately after the election of office of the CSRC unless otherwise desired by its members.</p>" +
                "<P><font color=\"#0033CC\">2.</font>Subsequent meetings of the CSRC shall be summoned by The Speaker acting through The Clerk.</p>" +
                "<P><font color=\"#0033CC\">3.</font>The CSRC sittings shall only be duly summoned provided a notice of its date, venue, time, and an agenda is properly conveyed to individual members of the CSRC and pasted on common notice boards by The Clerk at least 48hrs before the fixed time.</p>" +
                "<P><font color=\"#0033CC\">4.</font>Without prejudice to any part of The Constitution, emergency sittings may be summoned by The Clerk.</p>"));
        article4.add(new Constitution(3,5,"QUORUM IN THE CSRC","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>Quorum in the CSRC shall be formed by at least half (1/2) of the members.</p>" +
                "<P><font color=\"#0033CC\">2.</font>Where section 6, subsection 1 above fails, in case of emergency, ten (10) members shall form a quorum excluding The Speaker.</p>"));
        article4.add(new Constitution(3,6,"DELIBERATING MOTIONS","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>Deliberating motion shall only be called for by The Speaker of The House after an extensive deliberation on any issue under consideration.</p>" +
                "<P><font color=\"#0033CC\">2.</font>Such motions may be for, or against (counter motion) the subject under consideration, and must be put in writing and duly signed by the mover.</p>" +
                "<P><font color=\"#0033CC\">3.</font>The motion in support of any subject under consideration shall be seconded by another CSRC member before acceptance.</p>" +
                "<P><font color=\"#0033CC\">4.</font>The Speaker shall then call for an amendment of any motion moved.</p>" +
                "<P><font color=\"#0033CC\">5.</font>If there are no counter motions to any deliberating motion, then the latter passes unanimously.</p>" +
                "<P><font color=\"#0033CC\">6.</font>If there are counter motions, The Speaker calls for a vote after careful and prolonged deliberations.</p>" +
                "<P><font color=\"#0033CC\">7.</font>Except otherwise stated, in any part of The Constitution, a motion may be passed unanimously or by a simple majority vote or a procedural motion.</p>"));
        article4.add(new Constitution(3,7,"PROCEDURAL MOTION","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>Procedural motions may be called by The Speaker of CSRC.</p>" +
                "<P><font color=\"#0033CC\">2.</font>Members of The CSRC may call for procedural motions by raising a point of order, correction or information.</p>" +
                "<P><font color=\"#0033CC\">3.</font>Such points shall be to:</p>" +
                "(a.)  Withdraw a motion.<br>" +
                "(b.) Adjourn the meeting.<br>" +
                "(c.) Introduce any business deemed fit by The Speaker or by two-third (2/3) of the CSRC members present.<br>" +
                "(d.) Reverse a decision of The Speaker of CSRC by at least two-third (2/3) of CSRC members present.<br>" +
                "(e.) Suspend a standing order or a clause of The Constitution.<br>"));
        article4.add(new Constitution(3, 8, "STANDING ORDERS", "<font color=\"#0033CC\">Subsections:</font></p>" +
                "<p><font color=\"#0033CC\">1.</font>Every member of the CSRC shall be referred to as Honorable at all times.</p>" +
                "<P><font color=\"#0033CC\">2.</font>The Speaker’s entry shall be made known by The Clerk at any meeting and The House shall be on his feet.</p>" +
                "<P><font color=\"#0033CC\">3.</font>With the exception of The Speaker, every other person addressing The House shall be on his feet.</p>" +
                "<P><font color=\"#0033CC\">4.</font>If The Speaker has occasion to rise to assert his authority, any person standing shall immediately resume his seat and keep quiet.</p>" +
                "<P><font color=\"#0033CC\">5.</font>The principal officers of The CSRC and The EC members present shall sit at the High Table.</p>" +
                "<P><font color=\"#0033CC\">6.</font>All members shall be formally dressed at every sitting of the CSRC.</p>" +
                "<P><font color=\"#0033CC\">7.</font>Once The House has started its proceedings, to and fro movement is prohibited except with due permission from The Speaker.</p>" +
                "<p><font color=\"#0033CC\">8.\t</font>Every member of The Association must respect the ruling of The House.</p>" +
                "<p><font color=\"#0033CC\">9.\t</font>Disciplinary measure shall be taken by The Speaker against any member who contravenes the proceedings of the CSRC sittings.</p>" +
                "<p><font color=\"#0033CC\">10.\t</font>The Speaker shall make preference if two or more members raise their hands at a time.</p>" +
                "<p><font color=\"#0033CC\">11.</font>Debates within The House must be limited to immediate pending issues.</p>" +
                "<P><font color=\"#0033CC\">12.</font>The Speaker shall rule out any honorable who fails to adhere to the subject of discussion.</p>" +
                "<P><font color=\"#0033CC\">13.</font>The Speaker shall be called to any issued bothering on misconduct or negligence of duty.</p>" +
                "<P><font color=\"#0033CC\">14.</font>The rulings of The Speaker can be reversible by at least two-third (2/3) of the honorable present and voting.</p>" +
                "<P><font color=\"#0033CC\">15.</font>POINT OF ORDER: A point of order when raised shall be heard at all times except when voting or when The Speaker is on his feet.</p>" +
                "<P><font color=\"#0033CC\">16.</font>A point of order shall concern such matters as:</p>" +
                "(a.)  Indecorum.<br>" +
                "(b.) Intention to refer to standing orders or a clause of the constitution.<br>" +
                "(c.) A point of order shall stand reversible by two-third (2/3) of CSRC members, present and voting.<br>" +
                "(d.) When a section of the constitution is about to be breached.<br>" +
                "<P><font color=\"#0033CC\">17.</font>Standing order may be suspended when supported by two-third (2/3) of CSRC members present and voting.</p>" +
                "<P><font color=\"#0033CC\">18.\t</font>Recess</p>" +
                "(a.)  A recess shall be called by The Speaker.<br>" +
                "(b.) May be suggested by any member of the CSRC members present and voting.<br>" +
                "(c.) The recess shall not exceed 30 minutes.<br>" +
                "<P><font color=\"#0033CC\">19.\t</font>Motion for Adjournment</p>" +
                "(a.)  A motion for adjournment of a sitting may be moved after an extensive and decisive deliberation of the matters in the agenda.<br>" +
                "(b.) Further debates within The House will not be permitted once a motion for adjournment has been passed into resolution.<br>"));
        article4.add(new Constitution(3,9,"VOTING IN THE CSRC","<font color=\"#0033CC\">Subsections:</font></p>" +
                "<p><font color=\"#0033CC\">1.</font>Every member of the CSRC except The Speaker shall be entitled to vote within the CSRC.</p>" +
                "<P><font color=\"#0033CC\">2.</font>The Speaker shall have a casting and deliberate vote only when there is a tie.</p>" +
                "<P><font color=\"#0033CC\">3.</font>Voting in The CSRC shall be by show of hands except for the election of officers of CSRC which shall be by secret ballot.</p>"));
        article4.add(new Constitution(3,10,"ABSENTEEISM","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>Any member of the CSRC who absents himself from two consecutive meetings without prior notice to The Speaker in writing " +
                "shall be liable to be dismissed by The Speaker and such notice shall be deemed accepted or otherwise by two-third (2/3) of The House.</p>" +
                "<P><font color=\"#0033CC\">2.</font>Such person(s) shall be stripped of other office held in the CSRC for that session.</p>" +
                "<P><font color=\"#0033CC\">3.</font>Any member of The House that comes to a sitting later than 30mins after such sitting shall be deemed absent.</p>" +
                "<P><font color=\"#0033CC\">4.</font>Any CSRC members who fail to make up to 70% attendance of CSRC sittings shall not be eligible for certificate of " +
                "service except for part four (4) students who will be on industrial training (I.T) throughout the second semester.</p>"));
        article4.add(new Constitution(3,11,"RIGHTS OF ATTENDANCE","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>Nacossites shall have the right to attend CSRC sittings as observers except during closed door sittings.</p>" +
                "<P><font color=\"#0033CC\">2.</font>Non CSRC members can be permitted to speak at the discretion of The Speaker.</p>" +
                "<P><font color=\"#0033CC\">3.</font>Non CSRC members shall have no voting rights at CSRC sittings.</p>"));
        article4.add(new Constitution(3,12,"DISCIPLINARY ACTION","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>If any member of the CSRC is lagging behind in his/her duties</p>" +
                "<P><font color=\"#0033CC\">2.</font>If there is a vote of no confidence with at least 20 signatures from across the constituency <br>"+
                "The punishment ranges from suspension or expulsion from the CSRC.</p>" +
                "</p>"));
        //article 5
        article5.add(new Constitution(4,0,"section 1:","Organs of The Association shall include various committees" +
                " and clubs by which The Association functions and they shall be directly or indirectly responsible to the CSRC."));
        article5.add(new Constitution(4,1,"section 2:","Nomination of various committee members shall be made by the EC and forwarded to the" +
                " CSRC for approval at times deemed appropriate by it or at such times specified in relevant sections of this constitution."));
        article5.add(new Constitution(4,2,"section 3:","The following committee shall be set-up by the House as the need arises.</p>" +
                "(a.)  Constitutional Review Committee<br>" +
                "(b.) Election petition Committee<br>" +
                "(c.) Transition Committee<br>" +
                "(d.) Editorial Committee<br>" +
                "(e.) Fund Raising Committee<br>" +
                "(f.) Electoral Committee<br>" +
                "(g.) Audit Committee<br" +
                "(h.) Education and Library Committee<br>" +
                "(i.) Social and Sporting Committee<br>" +
                "(j.) Other committee shall be constituted based on the two-third (2/3) decision of the CSRC members and their roles will be explicitly stated by the CSRC.</p>"));
        article5.add(new Constitution(4,3,"FUNCTIONS OF THE COMMITTEE","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>AUDIT COMMITTEE</p>" +
                "(a.)  The audit committee shall be made up of not more than five (5) members, selected from each constituency including the chairman and secretary who shall be appointed by the CSRC/Congress on merit.<br>" +
                "(b.) Members of the committee must not be in the EC or CSRC of NACOSS.<br>" +
                "(c.) \tThe Audit Committee shall be set up at least once in a parliamentary year by the CSRC or The Congress to audit the financial statements of The Association.<br>" +
                "(d.) The financial statements of The Association shall be submitted to the chairman of the Audit committee when requested.<br>" +
                "(e.) The Audit committee shall process and present its findings to the CSRC/Congress not later than 3 weeks of its findings.<br>" +
                "<P><font color=\"#0033CC\">2.</font>CONSTITUTION REVIEW COMMITTEE</p>" +
                "(a.)  The Constitution Review Committee shall be constituted by the CSRC or The Congress if there is a need for amendment or review of The Constitution.<br>" +
                "(b.) It shall consist of five (5) members from each constituency including The Chairman and Secretary who shall be appointed by the CSRC/Congress.<br>" +
                "(c.) It shall deliberate upon all word resolution sent to it by the CSRC/Congress.<br>" +
                "(d.) It shall also conduct public hearings to accommodate opinions and views of all NACOSSITES.<br>" +
                "(e.) The constitution so reviewed shall be subjected to the approval of two-third (2/3) majority of CSRC members present.<br>" +
                "(f.) A plebiscite or a referendum may also be conducted before the reviewed constitution takes effect.<br>" +
                "<P><font color=\"#0033CC\">3.</font>DISCIPLINARY COMMITTEE</p>" +
                "(a.)  It shall consist of five (5) members from each constituency including The Chairman and Secretary who shall be appointed by the CSRC/Congress.<br>" +
                "(b.) No member of the EC/CSRC shall be a member of this committee.<br>" +
                "(c.) The committee shall try all cases referred to it by the CSRC/Congress concerning the activities of any officer or member of The Association.<br>" +
                "(d.) Following their findings, they shall submit their recommendation to the CSRC/Congress.<br>" +
                "(e.) Such recommendations can only be refused/taken by at least two-third (2/3) majority of CSRC/Congress members present and voting.<br>" +
                "<P><font color=\"#0033CC\">4.</font>ELECTORAL COMMITTEE</p>" +
                "(a.)   The Electoral Committee shall be constituted by CSRC/Congress.<br>" +
                "(b.)  It shall consist of five (5) members from each constituency including The Chairman and Secretary.<br>" +
                "(c.)  The Electoral Committee shall be responsible for conducting all elections into the EC/CSRC.<br>" +
                "(d.)  It shall conduct bye-election into vacant offices not later than 2 weeks after the seat has been declared vacant.<br>" +
                "(e.)  Its members shall not vote or be voted for in The Association elections or be eligible to campaign for any contestant in any election throughout the tenure of The Committee.<br>" +
                "(f.)  The Electoral Committee shall be responsible to the CSRC in the first instance and shall be responsible to the Congress when the CSRC stands dissolved but shall not be controlled by any person or group of person.<br>" +
                "(g.)  Any member of The Committee caught campaigning for any candidate or involved in other election malpractices would be dismissed immediately from the committee and would be banned from being nominated into such committee throughout his stay in the department.<br>" +
                "(h.)  The Committee shall have the right to disqualify any candidate.<br>" +
                "(i.)  The decision in section 4, subsection 4(h) above can be overturned by a simple majority of the CSRC members present.<br>" +
                "(j.)  The Committee shall set rules for the conduct of elections in accordance with the provisions of The Constitution.<br>" +
                "<P><font color=\"#0033CC\">5.</font>ELECTION PETITION COMMITTEE</p>" +
                "(a.)   The Election Petition Committee shall consist of five (5) members from each constituency including The Chairman and Secretary.<br>" +
                "(b.)  Members of the Electoral committee, CSRC and EC shall not constitute the Election Petition Committee.<br>" +
                "(c.)  It shall hear and decide all cases of election malpractices and irregularities.<br>" +
                "(d.)  The decision of the committee shall only be reversible by at least two-third (2/3) majority of CSRC members/Congress present.<br>" +
                "(e.)  The CSRC shall meet and decide on the petition not later than 72 hours of its acknowledgement.<br>" +
                "(f.)  The decisions taken in section 4, subsection 5(e) above shall be forwarded to the appropriate quarters within 24 hours.<br>" +
                "(g.)  In event of the cancellation of an election in accordance with section 4, subsection 5(f) above, a bye-election shall be held not later than two weeks of the cancellation.<br>" +
                "<P><font color=\"#0033CC\">6. </font>SOCIAL AND SPORT COMMITTEE</p>" +
                "(a.)   The Social and Sport committee shall consist of five (5) members from each constituency including The Chairman and Secretary.<br>" +
                "(b.)  It shall assist the Sport and Social Directors in any matters concerning their offices.<br>" ));
        article5.add(new Constitution(4,4,"FUNDS GARNERED BY THE COMMITTEES","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>Funds garnered shall be remitted to the EC on ground.</p>" +
                "<P><font color=\"#0033CC\">2.</font>Funds garnered shall be accountable to the CSRC.</p>" +
                "<P><font color=\"#0033CC\">3.</font>Shall be the decision of The President of The Association whether to remunerate committee members or not.</p>"));
        article5.add(new Constitution(4,5,"section 6:","The principal officers shall constitute the head of all the association clubs."));
        article5.add(new Constitution(4,6,"section 7:","The director for software/hardware shall be chosen from the principal officers by The President on advice of his executives and members of the CSRC."));
        article5.add(new Constitution(4,7,"section 8:","Such person as chosen in section 7 shall be in charge of the association website" +
                " and software/hardware resources of The Association, and shall work closely with the Librarian to procure software/hardware for the Library."));
        article5.add(new Constitution(4,8,"FUNCTIONS OF THE PRINCIPAL OFFICERS","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>They shall oversee the affairs of their various clubs.</p>" +
                "<P><font color=\"#0033CC\">2.</font>They shall make sure the clubs conform to The Association Constitution, rules and regulation at all time.</p>" +
                "<P><font color=\"#0033CC\">3.</font>They shall meet with the EC from time to time to discuss the club’s progress and any other matters concerning The Associations’ clubs.</p>" +
                "<P><font color=\"#0033CC\">4.</font>As deem fit by the CSRC or Congress.</p>"));
        article5.add(new Constitution(4,9,"section 10:","The roles of The Associations’ clubs shall include:</p>" +
                "Subsection " +
                "<p><font color=\"#0033CC\">1.</font>The creation of passionate interest in developing and enhancing programming, networking and designing skills.</p>" +
                "<P><font color=\"#0033CC\">2.</font>Extension of mindshare and ideas among members.</p>" +
                "<P><font color=\"#0033CC\">3.</font>Creating a platform for self-development.</p>" +
                "<P><font color=\"#0033CC\">4.</font>As deem fit by the CSRC or Congress.</p>"));
        article5.add(new Constitution(4,10,"section 11:","Rules and Regulations governing the clubs shall include:</p>" +
                "<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>The Associations’ clubs shall be governed by The Constitution at all time.</p>" +
                "<P><font color=\"#0033CC\">2.</font>The Associations’ clubs shall be closely monitored by The President at all time.</p>" +
                "<P><font color=\"#0033CC\">3.</font>The Associations’ decisions and programs supersede the club’s program and event at all time.</p>" +
                "<P><font color=\"#0033CC\">4.</font>Various clubs within The Association shall be responsible for its running and operation.</p>" +
                "<P><font color=\"#0033CC\">5.</font>Programs and Activities for each academic semester shall be submitted to the CSRC by the club heads for approval not later than four (4) weeks into a new academic semester.</p>" +
                "<P><font color=\"#0033CC\">6.</font>Upon refusal, rejection of such programs in section 11, Subsection 3 above, the club shall cease to exist except it complies with the CSRC decision or recommendation.</p>" +
                "<P><font color=\"#0033CC\">7.</font>Such recommendation shall be represented to the CSRC not later than two weeks for approval.</p>" +
                "8.\tThe club shall at no point in time derail from its role, aim and objectives as stated in section 10.</p>" +
                "9.\tAll NACOSSITE shall have the right to join the club of their choice.</p>" +
                "10.\tNo NACOSSITE shall have the privilege to join more than two clubs at the same time.</p>" +
                "<p>11.Without prejudice to any part of The Constitution, the CSRC/Congress shall have the power to " +
                "disengage any club or its members if it finds out that such person(s) does not conform to The Association Constitution or rules and regulation.</p>"));
            article5.add(new Constitution(4,11,"FORMATION OF NACOSS CLUBS","<font color=\"#0033CC\">Subsections:</font> " +
                    "<p><font color=\"#0033CC\">1.</font>The CSRC/Congress shall have the sole right to create and form The Associations’ club.</p>" +
                    "<P><font color=\"#0033CC\">2.</font>The Association’s club shall be formed upon a written request by:</p>" +
                    "(a.)   The EC, duly signed by The President and 2/3 of his members.<br>" +
                    "(b.)  One hundred (100) NACOSSITE’s appended signature duly represented from each constituency.<br>" +
                    "(c.)  "+"\tSuch request in section 12, subsection 2 above shall be forwarded to the CSRC for approval.<br>"));
        article6.add(new Constitution(5,0,"CONDUCT OF ELECTIONS","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>Election into the EC, CSRC, election of officers of the CSRC, shall be conducted by the electoral committee.</p>" +
                "<P><font color=\"#0033CC\">2.</font>The elections shall be in accordance with the following rules:</p>" +
                "(a.)   Without prejudice to any part of the constitution, the electoral committee shall decide final eligibility.<br>" +
                "(b.)  Such decisions of the electoral committee in section 1, subsection 2(a) above shall remain valid unless reversed by a simple majority of CSRC members present and voting at the assembly.<br>"));

        article6.add(new Constitution(5,1,"TIME OF ELECTIONS","<font color=\"#0033CC\">Subsections:</font> " +
                "<p><font color=\"#0033CC\">1.</font>Election into EC shall be held in first semester not later than five (5) weeks after resumption.</p>" +
                "<P><font color=\"#0033CC\">2.</font>Election into CSRC shall be in first semester within the first four (4) weeks of the new academic session.</p>"));
            article6.add(new Constitution(5,2,"ELIGIBILITY","<font color=\"#0033CC\">Subsections:</font> " +
                    "<p><font color=\"#0033CC\">1.</font>All financial members of NACOSS are eligible to contest for any office stipulated by the Electoral Committee.</p>" +
                    "<P><font color=\"#0033CC\">2.</font>All executive must be available throughout their tenure in office.</p>" +
                    "<P><font color=\"#0033CC\">3.</font>A dismissed/impeached officer of The Association shall not be eligible to contest.</p>" +
                    "<P><font color=\"#0033CC\">4.</font>NACOSSITES in the 4th year are not eligible to contest due to their leaving for industrial training (I.T).</p>" +
                    "<P><font color=\"#0033CC\">5.</font>Eligible part for the EC</p>" +
                    "(a.)  President --------------------Part V<br>" +
                    "(b.) Vice President ----------------Part III<br>" +
                    "(c.) General Secretary -------------Part III & V<br>" +
                    "(d.) Assistant General Secretary ---Part II<br>" +
                    "(e.) Public Relations Office--------Part III & V<br>" +
                    "(f.) Financial Secretary -----------Part III<br>" +
                    "(g.) Director of Social ------------Part II, III & V<br>" +
                    "(h.) Director of Sport -------------Part II & III<br>" +
                    "(i.) Librarian ---------------------Part II & III<br>" +
                    "(j.) Assistant Librarian -----------Part II<br>"));
            article6.add(new Constitution(5,3,"PROCEDURE OF ELECTIONS","<font color=\"#0033CC\">Subsections:</font> " +
                    "<p><font color=\"#0033CC\">1.</font>Except if otherwise stated in any part of The Constitution, the electoral committee shall be responsible for formulation rules, regulation and guidelines for the smooth running of the election.</p>" +
                    "<P><font color=\"#0033CC\">2.</font>The decision in section 4, subsection 1 above can be overturned by a simple majority of CSRC members present.</p>" +
                    "<P><font color=\"#0033CC\">3.</font>Contestant shall be sponsored by at least two financial members of The Association.</p>" +
                    "<P><font color=\"#0033CC\">4.</font>A member shall not sponsor more than one candidate.</p>" +
                    "<P><font color=\"#0033CC\">5.</font>Voting shall be done by secret ballot or otherwise stated by the electoral committee and approved by CSRC or Congress.</p>" +
                    "<P><font color=\"#0033CC\">6.</font>Counting of vote shall start immediately after the close of vote.</p>" +
                    "<P><font color=\"#0033CC\">7.</font>The result of the voting shall be announced immediately and published not more than twenty-four (24) hours after the announcement.</p>" +
                    "<P><font color=\"#0033CC\">8.</font>Election into the CSRC shall be seen to by the acting speaker, electoral committee members and class reps.</p>" +
                    "<P><font color=\"#0033CC\">9.</font>Every member of the CSRC shall be required to purchase a nomination form Electoral Committee before swearing-in.</p>"));
            article6.add(new Constitution(5,4,"SWEARING-IN","<font color=\"#0033CC\">Subsections:</font> " +
                    "<p><font color=\"#0033CC\">1.</font>Swearing-in of new officers shall be done not later than 72 hours after election.</p>" +
                    "<P><font color=\"#0033CC\">2.</font>The chairman of the electoral committee shall organize the swearing-in for the newly elected CSRC members.</p>" +
                    "<P><font color=\"#0033CC\">3.</font>The Speaker of the CSRC shall organize the swearing-in for the newly elected EC members.</p>" +
                    "<P><font color=\"#0033CC\">4.</font>If The Speaker is absent at the swearing-in ceremony, the Deputy Speaker shall preside over the ceremony, or any other person selected by the CSRC.</p>" +
                    "<P><font color=\"#0033CC\">5.</font>The new EC shall take over from the outgoing EC at a joint meeting to be held immediately after the swearing-in.</p>" +
                    "<P><font color=\"#0033CC\">6.</font>No officer shall assume the powers of his office except he has sworn an oath.</p>"));
            article6.add(new Constitution(5,5,"OATH OF OFFICE","<font color=\"#0033CC\">Subsections:</font> " +
                    "<p><font color=\"#0033CC\">1.</font>President/Speaker</p>" +
                    "I ___________________________ do solemnly swear, that I will faithfully, and beautifully bear and fly high the flag of The Nigerian Association of Computer Science Students, NACOSS.<br>" +
                    "That as the _____________________, I will discharge my duties to the best of my ability, faithfully and in accordance with the constitution of NACOSS and in the interest of the integrity, solidarity, wellbeing and prosperity of the members of NACOSS.<br>" +
                    "That I will strive to preserve the fundamental objectives and aim of NACOSS as contained in The Constitution without fear or favor, affection or ill-will.</p>"));
            article6.add(new Constitution(5,6,"RESIGNATION","<font color=\"#0033CC\">Subsections:</font> " +
                    "<p><font color=\"#0033CC\">1.</font>Any member of the executive council or member of committee can resign his office or post by tendering a resignation letter to the executive council.</p>" +
                    "<P><font color=\"#0033CC\">2.</font>All resignation letters should be directed to the Secretary General and the case of himself, to the President.</p>" +
                    "<P><font color=\"#0033CC\">3.</font>Any officer or committee member relinquishing his office shall hand over all documents and monies or any properties belonging to the association in his/her position to his/her successor within 48 hours after the election and the latter shall remain in office until such handing over is completed.</p>" +
                    "<P><font color=\"#0033CC\">4.</font>All resignation shall be subject to approval by a simple majority of the executive members present at the meeting.</p>" +
                    "<P><font color=\"#0033CC\">5.</font>The officer(s) concerned shall be notified in writing of the acceptance or otherwise of his resignation.</p>"));
            article6.add(new Constitution(5,7,"IMPEACHMENT","<font color=\"#0033CC\">Subsections:</font> " +
                    "<p><font color=\"#0033CC\">1.</font>Impeachment means removal from office and may arise as a result of gross misconduct or violation of the provision(s) of this constitution.</p>" +
                    "<P><font color=\"#0033CC\">2.</font>Executive officers of the association may be individual or collectively liable to impeachment by two-third majority of members voting at a congress meeting of the association.</p>" +
                    "<P><font color=\"#0033CC\">3.</font>In the event of vacancy as a result of impeachment, bye-elections shall be conducted within two weeks to fill such vacancy.</p>" +
                    "<P><font color=\"#0033CC\">4.</font>On no account shall an impeached member of the executive council contest for any office in the association for the rest of his/her program.</p>"));

            //article 7
            article7.add(new Constitution(6,0,"ANNUAL DUES","<font color=\"#0033CC\">Subsections:</font> " +
                    "<p><font color=\"#0033CC\">1.</font>Each member of the association shall pay an annual due as determined by the outgoing executives while the freshers will pay extra in support of their orientation programs at the beginning of sessions.</p>" +
                    "<P><font color=\"#0033CC\">2.</font>This due shall be subjected to variations by two-third majority of the members present and voting.</p>"));
            article7.add(new Constitution(6,1,"CONGRESS MEETINGS","<font color=\"#0033CC\">Subsections:</font> " +
                    "<p><font color=\"#0033CC\">1.</font>The congress shall meet at least twice in a semester.</p>" +
                    "<P><font color=\"#0033CC\">2.</font>The first congress in the first semester shall be for lifting of banner for campaigning and shall come up not later than third week of resumption into semester.</p>" +
                    "<P><font color=\"#0033CC\">3.</font>The last congress in the tenure of office of an executive council shall be held not later than two weeks before the rain semester exams.</p>" +
                    "<P><font color=\"#0033CC\">4.</font>The meetings of the congress may be convened by </p> " +
                    "(a.) The Secretary General under the instance of the President.<br>" +
                    "(b.) At least 3 out of 5 class representatives male and female in the cases of breakdown of order or lack of initiative on the part of the executive after due consultation with their various classes.<br>" +
                    "(c.) 30 members of the congress with not less than twenty-five percent (25%) each coming from at least four classes in such cases as in subsection 3b above.<br>" +
                    "<P><font color=\"#0033CC\">5.</font>The presiding officer shall be:</p>" +
                    "(a.)   The President in the case of congresses convened in accordance to provisions of the constitution.<br>" +
                    "(b.) The congress chairman elected by the congress at the meeting in cases of the congress convened according to the provisions of Subsection 3 b & c.<br>" +
                    "<P><font color=\"#0033CC\">6.</font>The election of the congress chairman shall be conducted by:</p>" +
                    "(a.)   One of the class representatives in cases of subsection 3b.<br>" +
                    "(b.)  One member of the congress who shall be a signatory to the proclamation or calling of the congress in accordance with subsection 3c.<br>" +
                    "<P><font color=\"#0033CC\">7.</font>For the purpose of this article, a notice of at least two days or at least one day in cases of proven emergency only, must be given to summon a meeting of the congress.</p>"));
            article7.add(new Constitution(6,2,"CERTIFICATE OF SERVICE","<font color=\"#0033CC\">Subsections:</font>" +
                    "<p><font color=\"#0033CC\">1.</font>Members of EC shall receive certificates of service at the end of the session.</p>" +
                    "<P><font color=\"#0033CC\">2.</font>Members of CSRC who make up to 70% of attendance of sittings shall receive certificates of service at the end of the parliamentary session.</p>" +
                    "<P><font color=\"#0033CC\">3.</font> Members of any committee set up by the EC or CSRC shall receive certificates of service, on recommendation of the chairman and secretary of such committee.</p>"));

    }
    public ArrayList<Constitution> getConstitution(int article){
        switch (article){
            case 0 :
                return article1;
            case 1 :
                return article2;
            case 2 :
                return article3;
            case 3 :
                return article4;
            case 4 :
                return article5;
            case 5:
                return article6;
            case 6:
                return article7;

        }
        return null;

    }
    /*
    *this method return the arrayList of all the constitution which contain the searched keyword
     */
    public  ArrayList<Constitution> search(String query){
        ArrayList<Constitution> array =new ArrayList<>();
        for(int i=0;i<7;i++){
            ArrayList<Constitution> article=getConstitution(i);
            for (Constitution section:article){
                String sectionText=section.getContent().toLowerCase();
                sectionText=getString(sectionText);
                String sectionName=section.getTitle().toLowerCase();
                query=query.toLowerCase();
                if(sectionText.contains(query)||sectionName.contains(query)){
                    array.add(section);
                }
            }
        }
        return array;
    }
    public String getString(String content){
        return Html.fromHtml(content).toString();
    }

    public int size(){
        return 7;
    }
    public Constitution getSection(int article,int section){
        ArrayList<Constitution> arrayList=getConstitution(article);
        for(Constitution entry: arrayList){
            if(entry.getSection()==section){
                return entry;
            }
        }
        return null;
    }
}
